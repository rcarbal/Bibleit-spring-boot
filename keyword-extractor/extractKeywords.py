# Extracts keywods from current files

import requests
import json
import spacy

nlp = spacy.load('en_core_web_lg')
from string import punctuation

url = 'http://localhost:8100/questions'
response = requests.request("GET", url)
res_json = json.loads(response.text)

print("starting keyword extraction...")


def get_hotwords(text):
    result = []
    pos_tag = ['PROPN', 'ADJ', 'NOUN', 'VERB']  # 1
    doc = nlp(text.lower())  # 2
    for token in doc:
        # 3
        if token.text in nlp.Defaults.stop_words or token.text in punctuation:
            continue
        # 4
        if token.pos_ in pos_tag:
            result.append(token.text)

    return result  # , execution_time


questions_with_keywords = []

index = 0


for question in res_json:

    if 'answer' in question:
        keywords = get_hotwords(question['answer'])
        removed_duplicates = set(keywords)

        keys = ""
        for keyword in removed_duplicates:
            keys += keyword + " "

        striped_keys = keys.strip()
        # check if has keywords
        if 'keywords' not in question:
            question['keywords'] = striped_keys
    question["id"] = index
    questions_with_keywords.append(question)
    index = index + 1


# save file
with open('mydata.json', 'w') as f:
    json.dump(questions_with_keywords, f)

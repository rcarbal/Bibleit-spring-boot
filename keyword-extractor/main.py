#!/usr/bin/env python3

import os
import json
from flask import Flask, request
from flask_cors import cross_origin
import spacy

from collections import Counter
from string import punctuation
import time

from file_writer import set_file, add_to_list, update_questions_to_files

app = Flask(__name__)
nlp = spacy.load('en_core_web_lg')

QUESTIONS = set_file('mydata.json')


@app.route('/', methods=['GET'])
def root():
    return {
        'name': 'keyword-extractor',
        'status': 'okay'
    }


@app.route('/questions', methods=['GET', 'POST'])
@cross_origin()
def questions():
    index = -1

    if request.method == 'GET':
        return json.dumps(QUESTIONS)
    elif request.method == 'POST':
        data = json.loads(request.data)
        keywords = get_hotwords(data['answer'])
        data['keywords'] = keywords
        added = add_to_list(questions=QUESTIONS, index=index, question_data=data)
        if added:
            # add to file
            file_updated_bool = update_questions_to_files(QUESTIONS)
            if file_updated_bool:

                return json.dumps({
                    'status': 200,
                    'question': QUESTIONS[-1]
                })


@app.route('/questions/<int:index>', methods=['GET'])
def get_question_index(index):
    if request.method == 'GET':
        return QUESTIONS[index]


@app.route('/keywords', methods=['GET'])
def get_all_question():
    if request.method == 'GET':
        req_args = request.args
        if 'input' not in req_args:
            return 'ERROR!!! no input in request args'
        verse = req_args['input']

        # found_keywords, execution_time = get_hotwords(verse)
        found_keywords = get_hotwords(verse)
        # found_keywords.append(execution_time)

        removed_duplicates = set(found_keywords)
        return_list = json.dumps(removed_duplicates)

        return return_list


def get_hotwords(text):
    time_start = time.time()
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
    time_end = time.time()
    execution_time = time_end - time_start

    return result  # , execution_time


if __name__ == '__main__':
    app.debug = bool(os.environ.get("DEBUG", True))
    port = int(os.environ.get("PORT", 8200))
    app.run(host='0.0.0.0', port=port)

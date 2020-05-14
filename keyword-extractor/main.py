#!/usr/bin/env python3

import os
import json
from flask import Flask, request
import spacy

from collections import Counter
from string import punctuation
import time

app = Flask(__name__)
nlp = spacy.load('en_core_web_lg')


@app.route('/', methods=['GET'])
def root():
    return {
        'name': 'keyword-extractor',
        'status': 'okay'
    }


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
    port = int(os.environ.get("PORT", 8000))
    app.run(host='0.0.0.0', port=port)

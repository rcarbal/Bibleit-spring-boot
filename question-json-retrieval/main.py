#!/usr/bin/env python3

import flask
import os
import requests
import json
from flask import Flask, request

from question.bible_questions import ANSWERED_QUESTIONS

app = Flask(__name__)

SERVER = os.getenv('HOME')


@app.route('/', methods=['GET'])
def root():
    return {
        'name': 'question-json-retrieval',
        'status': 'okay'
    }


@app.route('/questions', methods=['GET'])
def get_all_question():
    if request.method == 'GET':
        # get all questions
        # return all questions
        all_questions = json.dumps(ANSWERED_QUESTIONS)
        return all_questions


@app.route('/questions/<int:id>')
def get_question(id):
    return ANSWERED_QUESTIONS[id]


if __name__ == '__main__':
    app.debug = bool(os.environ.get("DEBUG", True))
    port = int(os.environ.get("PORT", 8100))
    app.run(host='0.0.0.0', port=port)

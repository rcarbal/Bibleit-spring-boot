#!/usr/bin/env python3

import flask
import os
import requests
import json
from flask import Flask, request

app = Flask(__name__)


@app.route('/', methods=['GET'])
def root():
    return {
        'name': 'keyword-extractor',
        'status': 'okay'
    }


@app.route('/keyword', methods=['GET'])
def get_all_question():
    if request.method == 'GET':
        # get all questions
        # return all questions

        return 'keywords-routes'


if __name__ == '__main__':
    app.debug = bool(os.environ.get("DEBUG", True))
    port = int(os.environ.get("PORT", 8000))
    app.run(host='0.0.0.0', port=port)

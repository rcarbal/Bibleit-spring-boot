#!/usr/bin/env python3
import os
import requests
from flask import Flask, request

app = Flask(__name__)

test_path = 'http://0.0.0.0:8100/'
official ='http://3.225.194.125/'

@app.route('/', defaults={'path': ''})
@app.route('/<path:path>')
def catch_all(path):
    response = requests.get(test_path + path)
    response_data = response.json()
    # return 'You want path: %s' % path
    print(response_data)
    return response_data

if __name__ == '__main__':
    app.debug = bool(os.environ.get("DEBUG", True))
    port = int(os.environ.get("PORT", 8000))
    app.run(host='0.0.0.0', port=port)
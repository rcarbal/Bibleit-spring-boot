#!/usr/bin/env python3
import os
from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def test():
    # return 'You want path: %s' % path
    return {'response': 'TRUE FROM TESTER'}


if __name__ == '__main__':
    app.debug = bool(os.environ.get("DEBUG", True))
    port = int(os.environ.get("PORT", 8100))
    app.run(host='0.0.0.0', port=port)
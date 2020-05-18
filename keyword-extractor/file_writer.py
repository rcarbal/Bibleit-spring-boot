import json


def add_to_file():
    pass


def set_file(json_file):
    with open('mydata.json') as json_file:
        return json.load(json_file)

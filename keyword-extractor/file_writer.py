import json


def add_to_list(questions, index, question_data):
    if index == -1:
        questions_length = len(questions)
        try:
            question_data['id'] = questions_length
            questions.append(question_data)
        except:
            return False
        return True


def update_questions_to_files(questions):
    with open('test.json', 'w') as f:
        json.dump(questions, f)

    return True


def set_file(json_file):
    with open('mydata.json') as json_file:
        return json.load(json_file)


def file_check_last_index():
    pass

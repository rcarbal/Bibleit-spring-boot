import json


def add_to_list(questions, id, question_data):
    if id == -1:
        questions_length = questions[-1]['id'] + 1

        try:
            question_data['id'] = questions_length
            questions.append(question_data)
        except:
            return False, questions[-1]['id']
        return True
    elif id >= 0:
        return_id = -1

        try:
            for i, item in enumerate(questions):
                item_id = int(item['id'])

                if item_id == id:
                    questions[i] = question_data
                    return_id = i
        except:
            return False, -1

        return True, return_id


def update_questions_to_files(questions):
    with open('test.json', 'w') as f:
        json.dump(questions, f)

    return True


def set_file(json_file):
    with open('test.json') as json_file:
        return json.load(json_file)


def file_check_last_index():
    pass

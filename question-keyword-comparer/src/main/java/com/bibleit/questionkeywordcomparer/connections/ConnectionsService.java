package com.bibleit.questionkeywordcomparer.connections;

import com.bibleit.questionkeywordcomparer.model.QuestionAnswer;

public interface ConnectionsService {

    QuestionAnswer[] getAllResponse();
    QuestionAnswer getIndexResponse(int index);
}

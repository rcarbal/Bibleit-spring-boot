package com.bibleit.questionkeywordcomparer.connections;

import com.bibleit.questionkeywordcomparer.model.QuestionAnswerImpl;

public interface ConnectionsService {

    QuestionAnswerImpl[] getAllResponse();
    QuestionAnswerImpl getIndexResponse(int index);
}

package com.bibleit.questionkeywordcomparer.connections;

import com.bibleit.questionkeywordcomparer.model.QuestionAnswer;
import com.bibleit.questionkeywordcomparer.model.QuestionAnswerImpl;

import java.util.List;

//TODO sortListByInput should return QuestionAnswer[]
public interface ConnectionsService {

    QuestionAnswerImpl[] getAllResponse();
    String getIndexResponse(int index);

    QuestionAnswer[] sortListByInput(List<QuestionAnswer> questions, String userInput);

    QuestionAnswerImpl[] testPostConnection(String uri, QuestionAnswerImpl[] data);
}

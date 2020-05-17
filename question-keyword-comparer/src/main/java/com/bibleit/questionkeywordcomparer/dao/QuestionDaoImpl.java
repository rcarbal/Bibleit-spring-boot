package com.bibleit.questionkeywordcomparer.dao;

import com.bibleit.questionkeywordcomparer.connections.ConnectionsService;
import com.bibleit.questionkeywordcomparer.model.QuestionAnswerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QuestionDaoImpl implements QuestionsDao {

    @Autowired
    ConnectionsService connections;

    public QuestionDaoImpl() {
    }

    @Override
    public QuestionAnswerImpl[] getAll() {
        //get all the questions JSON
        QuestionAnswerImpl[] questionFromResponse = connections.getAllResponse();

        return questionFromResponse;
    }
}

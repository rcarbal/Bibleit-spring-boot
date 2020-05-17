package com.bibleit.questionkeywordcomparer.connections;
import com.bibleit.questionkeywordcomparer.model.QuestionAnswerImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ConnectionsServiceImplTest {

    @Test
    public void connectToQuestionRetrievalService_Test(){
        //call connections
        ConnectionsServiceImpl connectionsServiceImpl = new ConnectionsServiceImpl();
        QuestionAnswerImpl[] questions = connectionsServiceImpl.getAllResponse();
        assertNotNull(questions);
    }

    @Test
    public void getFirstQuestionFromQuestionRetrievalService_Test(){
        // Get a single item
        ConnectionsServiceImpl connectionsServiceImpl = new ConnectionsServiceImpl();
        int index = 1;
        QuestionAnswerImpl response = connectionsServiceImpl.getIndexResponse(index);
    }

}
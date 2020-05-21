package com.bibleit.prioritysorterservice.scorer;

import com.bibleit.prioritysorterservice.model.QuestionAnswer;
import com.bibleit.prioritysorterservice.model.QuestionAnswerImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class LavensheinImplTest {
    
    @Test
    public void getScoreFromTwoStrings_TEST(){
        String question = "why did god destroy the world with the great flood?";
        String input1 = "why did God destroy the world with the great flood?";
        String input2 = "why god the world the great flood?";
        String input3 = "did God destroy world flood?";
        String input4 = "flood world destroy god did";
        
        
        QuestionAnswer[] arr = new QuestionAnswer[4];

        QuestionAnswerImpl question1 = new QuestionAnswerImpl();
        QuestionAnswerImpl question2 = new QuestionAnswerImpl();
        QuestionAnswerImpl question3 = new QuestionAnswerImpl();
        QuestionAnswerImpl question4 = new QuestionAnswerImpl();
        
        question1.setQuestion(input1);
        question2.setQuestion(input2);
        question3.setQuestion(input3);
        question4.setQuestion(input4);
        
        arr[0] = question1;
        arr[1] = question2;
        arr[2] = question3;
        arr[3] = question4;
        LavensheinImpl scorer = new LavensheinImpl();
        QuestionAnswer[] prioritizedArr = scorer.getScore(arr, question);
        
        // TODO input with same worlds but different order get identical score as same worlds in order 
        // TODO check the last 2
        assertNotNull(prioritizedArr);
        
    }
    

}
package com.bibleit.prioritysorterservice.algorithm;

import com.bibleit.prioritysorterservice.scorer.WordComparer;
import com.bibleit.prioritysorterservice.model.QuestionAnswer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SelectionSortImpl implements AlgorithmService{
    
    @Autowired
    private WordComparer comparer;

    @Override
    public QuestionAnswer[] sortUsingInput(QuestionAnswer[] arr, String input) {
        
        return new QuestionAnswer[0];
    }
}

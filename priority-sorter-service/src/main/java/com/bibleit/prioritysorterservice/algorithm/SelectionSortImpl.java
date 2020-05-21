package com.bibleit.prioritysorterservice.algorithm;

import com.bibleit.prioritysorterservice.model.QuestionAnswer;
import org.springframework.stereotype.Component;

@Component
public class SelectionSortImpl implements AlgorithmService{

    @Override
    public QuestionAnswer[] sortUsingInput(QuestionAnswer[] arr, String input) {
        return new QuestionAnswer[0];
    }
}

package com.bibleit.prioritysorterservice.sorter;

import com.bibleit.prioritysorterservice.algorithm.AlgorithmService;
import com.bibleit.prioritysorterservice.model.QuestionAnswer;
import com.bibleit.prioritysorterservice.scorer.WordComparer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SorterServiceImpl implements SorterService{

    @Autowired
    private WordComparer scorer;
    @Autowired
    private AlgorithmService service;
    
    @Override
    public QuestionAnswer[] sortList(QuestionAnswer[] arr, String input) {
        QuestionAnswer[] sortedArr = service.sortUsingInput(arr, input);
        return arr;
    }
}

package com.bibleit.prioritysorterservice.sorter;

import com.bibleit.prioritysorterservice.algorithm.AlgorithmService;
import com.bibleit.prioritysorterservice.model.QuestionAnswer;
import com.bibleit.prioritysorterservice.scorer.WordComparer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;

@Component
public class SorterServiceImpl implements SorterService{

    @Autowired
    private WordComparer comparer;
    @Autowired
    private AlgorithmService service;
    
    @Override
    public QuestionAnswer[] sortList(QuestionAnswer[] arr, String input) {
        QuestionAnswer[]  scoredArr = comparer.getScore(arr, input);
        QuestionAnswer[] sortedArr = service.sortUsingInput(scoredArr);

        // reverse array
        Collections.reverse(Arrays.asList(scoredArr));
        return sortedArr;
    }
}

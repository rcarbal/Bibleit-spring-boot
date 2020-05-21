package com.bibleit.prioritysorterservice.sorter;

import com.bibleit.prioritysorterservice.model.QuestionAnswer;

public interface SorterService {
    
    QuestionAnswer[] sortList(QuestionAnswer[] arr, String input);
}

package com.bibleit.prioritysorterservice.sorter;

import com.bibleit.prioritysorterservice.model.QuestionAnswer;

public interface SorterService {
    
    void sortList(QuestionAnswer[] arr);
}

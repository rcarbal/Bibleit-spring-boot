package com.bibleit.prioritysorterservice.algorithm;

import com.bibleit.prioritysorterservice.model.QuestionAnswer;

public interface AlgorithmService {
    QuestionAnswer[] sortUsingInput(QuestionAnswer[] arr);
}

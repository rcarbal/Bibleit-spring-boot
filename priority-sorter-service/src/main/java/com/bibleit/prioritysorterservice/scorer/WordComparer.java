package com.bibleit.prioritysorterservice.scorer;

import com.bibleit.prioritysorterservice.model.QuestionAnswer;

public interface WordComparer {
    QuestionAnswer[] getScore(QuestionAnswer[] fromData, String fromUser);
}

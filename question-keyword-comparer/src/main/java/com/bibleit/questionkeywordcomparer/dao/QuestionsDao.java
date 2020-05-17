package com.bibleit.questionkeywordcomparer.dao;

import com.bibleit.questionkeywordcomparer.model.QuestionAnswerImpl;

public interface QuestionsDao {

    QuestionAnswerImpl[] getAll();
}

package com.bibleit.questionkeywordcomparer.utils.keywordExtractor;

import com.bibleit.questionkeywordcomparer.model.CompareData;
import com.bibleit.questionkeywordcomparer.model.QuestionAnswerImpl;

import java.util.List;

public interface KeywordCompare {
    CompareData getWordScore(String input, String keywords);
    List<QuestionAnswerImpl> getListOfScored(QuestionAnswerImpl[] array, String userInput);
}

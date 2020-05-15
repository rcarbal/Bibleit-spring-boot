package com.bibleit.questionkeywordcomparer.utils.keywordExtractor;

import com.bibleit.questionkeywordcomparer.model.CompareData;

public interface KeywordCompare {
    CompareData getWordScore(String input, String keywords);
}

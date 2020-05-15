package com.bibleit.questionkeywordcomparer.utils.keywordExtractor;

import com.bibleit.questionkeywordcomparer.model.CompareData;
import org.apache.commons.text.similarity.FuzzyScore;

import java.util.Locale;


public class FuzzyKeywordCompareImpl implements KeywordCompare {
    @Override
    public CompareData getWordScore(String keyword, String query) {

        double fuzzyScore = new FuzzyScore(Locale.ENGLISH).fuzzyScore(keyword, query);
        return null;
    }
}

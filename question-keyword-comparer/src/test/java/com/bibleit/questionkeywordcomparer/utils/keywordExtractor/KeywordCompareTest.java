package com.bibleit.questionkeywordcomparer.utils.keywordExtractor;

import com.bibleit.questionkeywordcomparer.model.CompareData;
import org.junit.jupiter.api.Test;

class KeywordCompareTest {

    String keyword = "human thoughts evil god time heart";
    String query = "are humans evil?";

    @Test
    public void getWordScoreFuzzy_TEST(){

        FuzzyKeywordCompareImpl compare = new FuzzyKeywordCompareImpl();
        CompareData score = compare.getWordScore(keyword, query);
        System.out.println(keyword + " | " + query);
        System.out.println(score);

    }

    @Test
    public void getWordScoreLevenshtein_TEST(){
        LevenshteinCompareImpl compare = new LevenshteinCompareImpl();
        CompareData score = compare.getWordScore(query, keyword);
        System.out.println(keyword + " | " + query);
        System.out.println(score);
    }

}
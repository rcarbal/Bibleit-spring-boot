package com.bibleit.questionkeywordcomparer.utils.keywordExtractor;

import com.bibleit.questionkeywordcomparer.model.CompareData;
import org.apache.commons.text.similarity.LevenshteinDistance;
import org.springframework.stereotype.Component;

@Component
public class LevenshteinCompareImpl implements KeywordCompare{

    public LevenshteinCompareImpl() {
    }

    @Override
    public CompareData getWordScore(String input, String keywords) {

        double score = 0.0;
        String comparedKeywords = "";
        //remove '?'
        String myInput = null;
        myInput = input.replace("?", "");

        String[] keywordsSplit = keywords.split(" ");
        String[] inputSplit = myInput.split(" ");

        LevenshteinDistance distance = new LevenshteinDistance();

        for (String key : keywordsSplit){
            for (String inp : inputSplit){
                double dist = distance.apply(inp, key);
                if (dist < 2.0){
                    comparedKeywords = comparedKeywords + inp + ":" + key + " ";
                    score ++;
                }
            }
        }

        CompareData data = new CompareData();
        data.setAcumilatedScore(score);
        data.setScoredWords(comparedKeywords);


        return data;
    }
}

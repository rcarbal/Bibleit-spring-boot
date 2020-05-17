package com.bibleit.questionkeywordcomparer.utils.keywordExtractor;

import com.bibleit.questionkeywordcomparer.model.CompareData;
import com.bibleit.questionkeywordcomparer.model.QuestionAnswerImpl;
import org.apache.commons.text.similarity.LevenshteinDistance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LevenshteinCompareImpl implements KeywordCompare{

    @Autowired
    private KeywordCompare keywordCompare;

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

                    // this score tells how many words matched
                    score ++;
                }
            }
        }

        if (score < 2.0) {
            return null;
        }

        CompareData data = new CompareData();
        data.setAcumilatedScore(score);
        data.setScoredWords(comparedKeywords);


        return data;
    }

    @Override
    public List<QuestionAnswerImpl> getListOfScored(QuestionAnswerImpl[] array, String userInput) {
        List<QuestionAnswerImpl> scoredQuestions = new ArrayList<>();

        //compare the keywords
        for (QuestionAnswerImpl question : array){
            // scores keywords to user input
            CompareData data = keywordCompare.getWordScore(question.getKeywords(), userInput);

            if (data != null){
                // add to array any question that have words found
                if (data.getAcumilatedScore() > 0){
                    question.setScore(data.getAcumilatedScore());
                    question.setMatches(data.getScoredWords());
                    scoredQuestions.add(question);
                }
            }
        }
        return scoredQuestions;
    }
}

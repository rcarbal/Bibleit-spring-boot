package com.bibleit.questionkeywordcomparer.utils.comparer;

import com.bibleit.questionkeywordcomparer.dao.QuestionsDao;
import com.bibleit.questionkeywordcomparer.model.CompareData;
import com.bibleit.questionkeywordcomparer.model.QuestionAnswer;
import com.bibleit.questionkeywordcomparer.model.QuestionAnswerImpl;
import com.bibleit.questionkeywordcomparer.utils.elementRemover.ElementRemover;
import com.bibleit.questionkeywordcomparer.utils.keywordExtractor.KeywordCompare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class QuestionComparerImpl implements QuestionComparer{

    @Autowired
    private QuestionsDao questionsDao;
    @Autowired
//    @Qualifier("LevenshteinCompareImpl")
    private KeywordCompare keywordCompare;
    @Autowired
    private ElementRemover remover;

    // This method call will take care of comparing the pojo to keywords
    @Override
    public List<QuestionAnswer> getBestMatched(String userInput) {
        // gets all questions
        QuestionAnswerImpl[] questions = questionsDao.getAll();
        List<QuestionAnswerImpl> scoredQuestions = new ArrayList<>();

        //compare the keywords
        for (QuestionAnswerImpl question : questions){
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
        Collections.sort(scoredQuestions);

        // return 10 questions
        int removeAmount = 10;
        List<QuestionAnswer> finalQuestions = remover.removeFromList(scoredQuestions, removeAmount);
        return finalQuestions;
    }
}

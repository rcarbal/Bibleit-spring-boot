package com.bibleit.questionkeywordcomparer.utils.comparer;

import com.bibleit.questionkeywordcomparer.dao.QuestionsDao;
import com.bibleit.questionkeywordcomparer.model.CompareData;
import com.bibleit.questionkeywordcomparer.model.QuestionAnswer;
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

    // This method call will take care of comparing the pojo to keywords
    @Override
    public List<QuestionAnswer> getBestMatched(String userInput) {
        QuestionAnswer[] questions = questionsDao.getAll();
        List<QuestionAnswer> scoredQuestions = new ArrayList<>();

        //compare the keywords
        for (QuestionAnswer question : questions){
            CompareData data = keywordCompare.getWordScore(question.getKeywords(), userInput);
            if (data.getAcumilatedScore() > 0){
                question.setScore(data.getAcumilatedScore());
                question.setMatches(data.getScoredWords());
                scoredQuestions.add(question);
            }
        }
        Collections.sort(scoredQuestions);

        // return 20 questions
        List<QuestionAnswer> last20OfQuestions = new ArrayList<>();
        int length = scoredQuestions.size();
        for (int i = length; i > length - 20 ; i--){
            last20OfQuestions.add(scoredQuestions.get(i-1));
        }
        return last20OfQuestions;
    }
}

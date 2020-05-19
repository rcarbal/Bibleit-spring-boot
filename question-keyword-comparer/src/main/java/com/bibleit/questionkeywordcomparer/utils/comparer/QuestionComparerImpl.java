package com.bibleit.questionkeywordcomparer.utils.comparer;

import com.bibleit.questionkeywordcomparer.dao.QuestionsDao;
import com.bibleit.questionkeywordcomparer.model.QuestionAnswer;
import com.bibleit.questionkeywordcomparer.model.QuestionAnswerImpl;
import com.bibleit.questionkeywordcomparer.model.QuestionType;
import com.bibleit.questionkeywordcomparer.utils.elementRemover.ElementRemover;
import com.bibleit.questionkeywordcomparer.utils.keywordExtractor.KeywordCompare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
    public List<QuestionAnswer> getBestMatched(String userInput, QuestionType type) {
        // gets all questions
        QuestionAnswerImpl[] questions = questionsDao.getAll();
        
        List<QuestionAnswerImpl> scoredQuestions = keywordCompare.getListOfScored(questions, userInput, type);

        Collections.sort(scoredQuestions);

        // return 10 questions
        int removeAmount = 10;
        List<QuestionAnswer> finalQuestions = remover.removeFromList(scoredQuestions, removeAmount);
        return finalQuestions;
    }
}

package com.bibleit.questionkeywordcomparer.utils.comparer;
import com.bibleit.questionkeywordcomparer.model.QuestionAnswer;
import com.bibleit.questionkeywordcomparer.model.QuestionType;

import java.util.List;

public interface QuestionComparer {
    List<QuestionAnswer> getBestMatched(String userInput, QuestionType getTypeFromQuestionData);
}

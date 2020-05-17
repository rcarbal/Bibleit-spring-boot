package com.bibleit.questionkeywordcomparer.utils.elementRemover;

import com.bibleit.questionkeywordcomparer.model.QuestionAnswer;

import java.util.List;

public interface ElementRemover<T> {
    List<QuestionAnswer> removeFromList(List<T> array, int amountToRemove);
}

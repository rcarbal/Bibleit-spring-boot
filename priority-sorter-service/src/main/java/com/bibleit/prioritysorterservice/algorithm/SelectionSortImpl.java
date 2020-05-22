package com.bibleit.prioritysorterservice.algorithm;

import com.bibleit.prioritysorterservice.model.QuestionAnswer;
import com.bibleit.prioritysorterservice.model.QuestionAnswerImpl;
import org.springframework.stereotype.Component;

@Component
public class SelectionSortImpl implements AlgorithmService{
    


    @Override
    public QuestionAnswer[] sortUsingInput(QuestionAnswer[] arrData) {

        QuestionAnswerImpl[] arr = (QuestionAnswerImpl[]) arrData;

        for (int lastUnsortedIndex = arr.length -1; lastUnsortedIndex >0; lastUnsortedIndex--){
            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++){
                if (arr[i].getScore() > arr[largest].getScore()){
                    largest = i;
                }
            }
            swap(arr, largest, lastUnsortedIndex);
        }

        for (int i= 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        
        return arr;
    }

    public static void swap(QuestionAnswer[] array, int i, int j){
        if (i == j){
            return;
        }
        QuestionAnswer temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

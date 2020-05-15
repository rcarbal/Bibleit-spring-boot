package com.bibleit.questionkeywordcomparer.utils.algorithms;

import com.bibleit.questionkeywordcomparer.model.BibleitDataType;

import java.util.List;

public class InsertionSort {

    public List<BibleitDataType> sortDataCollection(List<BibleitDataType> listOfData){

        BibleitDataType[] array = (BibleitDataType[]) listOfData.toArray();

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < listOfData.size(); firstUnsortedIndex++){
            BibleitDataType newElement = listOfData.get(firstUnsortedIndex);

            int i;

            for (i = firstUnsortedIndex; i > 0 && listOfData.get(i -1).getScore() > newElement.getScore();i--){

            }
        }

        return null;
    }
}

package co.bibleit.springboot.sort.samples;

import org.junit.jupiter.api.Test;

public class SortAlgorithmsTest {

    @Test
    public void selectionSortExample(){
        int[] array = {300, 2, 34, 14, 26, 4, 1, 634 };

        for(int lastUnsortedIndex = array.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--){

            // when starting the largest element is at position 0
            int largestIndex = 0;

            // we use <= because we want to make sure we compare every element to every element
            for (int i= 1; i <= lastUnsortedIndex; i++){
                if (array[i] > array[largestIndex]){
                    largestIndex = i;
                }
            }

            // once the loop over swap the largest
            swap(array, largestIndex, lastUnsortedIndex);
        }
        for (int i=0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }


    public static void swap(int[] array, int i, int j){
        if (i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

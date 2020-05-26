package com.bibleit.questionkeywordcomparer.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    public void removeDuplicateWords_TEST(){
        String str = "Because of of how great mankind wickedness was, God wiped away all things the that moved on the ground" +
                " and flew through the air, except Noah and his family family.";
        String[] arr = str.split("\\s+");

        String[] returnedString = StringUtils.removeDuplicates(arr);
        assertNotNull(returnedString);
    }

}
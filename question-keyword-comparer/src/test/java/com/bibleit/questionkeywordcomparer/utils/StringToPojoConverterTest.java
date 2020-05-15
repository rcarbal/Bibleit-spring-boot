package com.bibleit.questionkeywordcomparer.utils;

import com.bibleit.questionkeywordcomparer.model.QuestionAnswer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToPojoConverterTest {
    @Test
    public void convertStringToPOJO_Test(){
        StringToPojoConverter converter = new StringToPojoConverter();

        String jsonString = "[{\n" +
                "    \"answer\": \"God created all the the heavens and the earth in the beginning.\",\n" +
                "    \"question\": \"what did God create in the beginning?\",\n" +
                "    \"verse\": \"Genesis 1:1\"\n" +
                "}, {\"answer\": \"This is a test answer\", \"question\": \"This is a test question\", \"verse\": \"This " +
                "is a test verse\"}]";
        QuestionAnswer[] pojo = converter.convertToPOJO(jsonString);

    }

}
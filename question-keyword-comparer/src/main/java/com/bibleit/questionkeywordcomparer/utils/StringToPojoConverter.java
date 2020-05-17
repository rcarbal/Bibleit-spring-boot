package com.bibleit.questionkeywordcomparer.utils;

import com.bibleit.questionkeywordcomparer.model.QuestionAnswerImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class StringToPojoConverter {

    public StringToPojoConverter() {
    }

    public QuestionAnswerImpl[] convertToPOJO(String jsonString) {
        ObjectMapper mapper = new ObjectMapper();
        QuestionAnswerImpl[] arrayOfP = null;
        try {
             arrayOfP = mapper.readValue(jsonString, QuestionAnswerImpl[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayOfP;
    }
}

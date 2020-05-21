package com.bibleit.questionkeywordcomparer.connections;

import com.bibleit.questionkeywordcomparer.model.QuestionAnswer;
import com.bibleit.questionkeywordcomparer.model.QuestionAnswerImpl;
import com.bibleit.questionkeywordcomparer.utils.StringToPojoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

//TODO should return QuestionAnswer not QuestionAnswerImpl
@Component
public class ConnectionsServiceImpl implements ConnectionsService{
    @Autowired
    private StringToPojoConverter converter;
    private final String localHostQuestionRetrieval = "http://localhost:8200/questions";
    private final String localHosPrioritySorter = "http://localhost:8400";

    //TODO builder should be a bean
    private WebClient.Builder builder = WebClient.builder();

    // Returns all json response to array
    @Override
    public QuestionAnswerImpl[] getAllResponse() {

        String response = builder
                .build()
                .get()
                .uri(localHostQuestionRetrieval)
                .retrieve()
                .bodyToMono(String.class)
                .block();
        QuestionAnswerImpl[] convertedResponse = converter.convertToPOJO(response);
        return convertedResponse;
    }

    @Override
    public String getIndexResponse(int index) {
        String uri = localHostQuestionRetrieval + "/" + index;
        
        String response = builder
                .build()
                .get()
                .uri(uri)
                .retrieve()
                .bodyToMono(String.class)
                .block();
        return response;
    }

    @Override
    public QuestionAnswer[] sortListByInput(List<QuestionAnswer> questions, String userInput) {
        
        String uri ="http://localhost:8400/prioritySorting" + "?input=" + userInput;

        QuestionAnswer[] response = builder
                .build()
                .post()
                .uri(uri)
                .body(BodyInserters.fromValue(questions))
                .retrieve()
                .bodyToMono(QuestionAnswerImpl[].class)
                .block();

        return response;
    }

    @Override
    public QuestionAnswerImpl[] testPostConnection(String uri, QuestionAnswerImpl[] data) {
        QuestionAnswerImpl[] res = builder
                .build()
                .post()
                .uri(uri + "/test")
                .body(BodyInserters.fromValue(data))
                .retrieve()
                .bodyToMono(QuestionAnswerImpl[].class)
                .block();
        
        return res;
    }
}

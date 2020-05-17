package com.bibleit.questionkeywordcomparer.connections;

import com.bibleit.questionkeywordcomparer.model.QuestionAnswerImpl;
import com.bibleit.questionkeywordcomparer.utils.StringToPojoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class ConnectionsServiceImpl implements ConnectionsService{
    @Autowired
    private StringToPojoConverter converter;
    private final String localHostQuestionRetrieval = "http://localhost:8200/questions";

    // Returns all json response to array
    @Override
    public QuestionAnswerImpl[] getAllResponse() {

        WebClient.Builder builder = WebClient.builder();

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
    public QuestionAnswerImpl getIndexResponse(int index) {
        String uri = localHostQuestionRetrieval + "/" + index;

        WebClient.Builder builder = WebClient.builder();
        QuestionAnswerImpl response = builder
                .build()
                .get()
                .uri(uri)
                .retrieve()
                .bodyToMono(QuestionAnswerImpl.class)
                .block();
        return response;
    }
}

package com.bibleit.questionkeywordcomparer.responses;

import com.bibleit.questionkeywordcomparer.model.Response;
import org.springframework.stereotype.Component;

@Component
public class ResponseServiceImpl implements ResponseService{

    @Override
    public Response retrieveHardCodedResponse() {
        return new Response("question-keyword-comparer", 200);
    }
}

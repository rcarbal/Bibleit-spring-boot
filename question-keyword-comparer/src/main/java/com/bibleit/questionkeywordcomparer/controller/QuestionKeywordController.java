package com.bibleit.questionkeywordcomparer.controller;

import com.bibleit.questionkeywordcomparer.model.QuestionAnswer;
import com.bibleit.questionkeywordcomparer.model.Response;
import com.bibleit.questionkeywordcomparer.responses.ResponseService;
import com.bibleit.questionkeywordcomparer.utils.comparer.QuestionComparer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestionKeywordController {

    @Autowired
    private ResponseService responseService;
    @Autowired
    private QuestionComparer comparer;

    @GetMapping("/")
    public Response index(){
        return responseService.retrieveHardCodedResponse();
    }

    @GetMapping("/matchedAnswers")
    public List<QuestionAnswer> getQuestionMatch(@RequestParam String userInput){
        List<QuestionAnswer> questions = comparer.getBestMatched(userInput);
        return questions;
    }

}

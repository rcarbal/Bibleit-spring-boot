package com.bibleit.prioritysorterservice.controller;

import com.bibleit.prioritysorterservice.model.QuestionAnswer;
import com.bibleit.prioritysorterservice.model.QuestionAnswerImpl;
import com.bibleit.prioritysorterservice.sorter.SorterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SortingController {

    @Autowired
    private SorterService service;

    @GetMapping("/")
    public String index(){
        return "SortingController: OK";
    }

    @PostMapping("/test")
    public QuestionAnswerImpl[]  test(@RequestBody QuestionAnswerImpl[] body){
        System.out.println();
        return body;
    }

    //@RequestBody QuestionAnswerImpl[] arr, @RequestParam String input
    @PostMapping("/prioritySorting")
    public QuestionAnswer[] sortResponse(@RequestBody QuestionAnswerImpl[] body, @RequestParam String input){
        QuestionAnswer[] sortedQuestions = service.sortList(body, input);
        return sortedQuestions;
    }
}

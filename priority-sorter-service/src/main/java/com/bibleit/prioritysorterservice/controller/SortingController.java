package com.bibleit.prioritysorterservice.controller;

import com.bibleit.prioritysorterservice.model.QuestionAnswerImpl;
import com.bibleit.prioritysorterservice.sorter.SorterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SortingController {
    
    @Autowired
    private SorterService service;

    @GetMapping("/")
    public String index(){
        return "SortingController: OK";
    }

    @GetMapping("/prioritySorting")
    public void sortResponse(@RequestBody List<QuestionAnswerImpl> arr){
        System.out.println();
    }
}

package com.bibleit.prioritysorterservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SortingController {

    @GetMapping("/")
    public String index(){
        return "SortingController: OK";
    }

    @GetMapping("/prioritySorting")
    public void sortResponse(){
        
    }
}

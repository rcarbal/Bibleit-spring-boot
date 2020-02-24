package co.bibleit.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {

    @RequestMapping("/")
    public String index(){
        return "hello worlds";
    }
}

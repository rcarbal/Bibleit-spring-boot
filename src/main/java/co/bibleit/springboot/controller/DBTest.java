package co.bibleit.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dbtest")
public class DBTest {

    @GetMapping("/section")
    public String sections(){
        return "Sections section";
    }
}

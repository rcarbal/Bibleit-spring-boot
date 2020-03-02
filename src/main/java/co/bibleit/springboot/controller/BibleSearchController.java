package co.bibleit.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BibleSearchController {

    @RequestMapping("/")
    public String bibleSearch(Model theModel){

        theModel.addAttribute("theDate", new java.util.Date());

        return "search";
    }
}

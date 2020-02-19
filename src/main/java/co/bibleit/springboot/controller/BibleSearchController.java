package co.bibleit.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@RestController()
@Controller
public class BibleSearchController {

    @RequestMapping("/")
    public String bibleSearch(){
        return "search";
    }

    @RequestMapping("/bibleSearch")
    public String searchResult(@RequestParam("search") String theSearch, Model model){

        String response = "You searched for: " + theSearch;
        model.addAttribute("result", response );

        return "search-result";
    }
}

package co.bibleit.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dbtest")
public class BibleSearchController {

    @RequestMapping("/section")
    public String bibleSearch(){
        return "search";
    }

//    @RequestMapping("/test")
//    public String test(){
//        List<BibleSection> theBibleSection = bibleitDAO.getBibleSections();
//        return "search";
//    }

//    @RequestMapping("/bibleSearch")
//    public String searchResult(@RequestParam("search") String theSearch, Model model){
//
//        String response = "You searched for: " + theSearch;
//        model.addAttribute("result", response );
//
//        List<BibleSection> theBibleSection = bibleitDAO.getBibleSections();
//
//        return "search-result";
//    }
}

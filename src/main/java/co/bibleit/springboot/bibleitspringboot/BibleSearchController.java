package co.bibleit.springboot.bibleitspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

//@RestController()
@Controller
public class BibleSearchController {

    @RequestMapping("/")
    public String bibleSearch(){
        return "search";
    }

    @RequestMapping("/bibleSearch")
    public String searchResult(HttpServletRequest request, Model model){

        String theSearch = request.getParameter("search");
        String response = "You searched for: " + theSearch;
        model.addAttribute("result", response );

        return "search-result";
    }
}

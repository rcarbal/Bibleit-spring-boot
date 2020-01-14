package co.bibleit.springboot.bibleitspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class BibleSearch {

    @RequestMapping("/")
    public String bibleSearch(){
        return "Bible Search";
    }
}

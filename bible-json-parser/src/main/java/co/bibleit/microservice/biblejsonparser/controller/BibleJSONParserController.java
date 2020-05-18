package co.bibleit.microservice.biblejsonparser.controller;

import co.bibleit.microservice.biblejsonparser.dao.BibleJSONDao;
import co.bibleit.microservice.biblejsonparser.utl.environment.InstanceInformationService;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BibleJSONParserController {

    @Autowired
    private Environment environment;
    @Autowired
    BibleJSONDao dao;
    @Autowired
    private InstanceInformationService instanceInformationService;

    @GetMapping("/")
    public String okayResponse(){
        return "bible-json-parser : OKAY";
    }

    @GetMapping("/bible")
    public JSONObject retrieveBibleJson(){
        return dao.getBible();
    }
    
    @GetMapping("/books")
    public String[] getCompleteBibleInObjectForm(){
        return dao.getBooks();
    }
}

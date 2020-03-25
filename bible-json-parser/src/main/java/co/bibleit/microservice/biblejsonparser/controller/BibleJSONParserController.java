package co.bibleit.microservice.biblejsonparser.controller;

import co.bibleit.microservice.biblejsonparser.dao.BibleJSONDao;
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

    @GetMapping("/bible-json-parser/bible")
    public JSONObject retrieveBibleJson(){

        JSONObject object = new JSONObject();
        object.put("bible", dao.getBible());
        object.put("port", Integer.parseInt(environment.getProperty("local.server.port")));

        return object;
    }
}

package co.bibleit.microservice.dataparser.bibledataparser.controller;

import co.bibleit.microservice.dataparser.bibledataparser.dao.BibleJSONDao;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BibleDataParserController {

    @Autowired
    private Environment environment;
    @Autowired
    private BibleJSONDao doa;


    @GetMapping("/bible-data-parser/bible")
    public JSONObject retrieveBibleJson(){
        return doa.getBible();
    }

}

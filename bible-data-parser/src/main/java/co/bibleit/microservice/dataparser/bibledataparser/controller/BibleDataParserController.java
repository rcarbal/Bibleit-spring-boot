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

    private BibleJSONDao doa;


    @GetMapping("/bible-parser-endpoints/bible")
    public JSONObject retrieveBibleJson(){
        JSONObject object = new JSONObject();
        object.put("bible", "THIS IS NOT THE ENTIRE BIBLE");
        object.put("port", (Integer.parseInt(environment.getProperty("local.server.port"))));

        return object;
    }

}

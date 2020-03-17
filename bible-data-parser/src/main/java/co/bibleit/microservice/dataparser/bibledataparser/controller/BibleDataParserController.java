package co.bibleit.microservice.dataparser.bibledataparser.controller;

import co.bibleit.microservice.dataparser.bibledataparser.bean.Configuration;
import co.bibleit.microservice.dataparser.bibledataparser.dao.BibleJSONDao;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class BibleDataParserController {

    @Autowired
    private Configuration configuration;
    @Autowired
    private Environment environment;
    @Autowired
    private BibleJSONDao doa;

    @GetMapping("/configuration")
    public Map<String, Integer> getCompleteBibleJson(){

        HashMap<String, Integer> configurationToReturn = new HashMap<>();
        configurationToReturn.put("max", configuration.getConfigurationMaximum());
        configurationToReturn.put("min", configuration.getConfigurationMinimum());
        return configurationToReturn;
    }

    @GetMapping("/bible-data-parser/bible")
    public JSONObject retrieveBibleJson(){
        return doa.getBible();
    }

}

package co.bibleit.microservice.bibleparserendpoints.controller;


import co.bibleit.microservice.bibleparserendpoints.bean.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class BibleParserEndpointsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/configuration")
    public Map<String, Integer> getCompleteBibleJson(){

        HashMap<String, Integer> configurationToReturn = new HashMap<>();
        configurationToReturn.put("max", configuration.getConfigurationMaximum());
        configurationToReturn.put("min", configuration.getConfigurationMinimum());
        return configurationToReturn;
    }
}

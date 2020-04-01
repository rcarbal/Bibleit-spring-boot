package co.bibleit.microservice.bibledataendpoints.controller;

import co.bibleit.microservice.bibledataendpoints.proxy.BibleJsonParserProxy;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataEndpointsController {

    @Autowired
    private BibleJsonParserProxy proxy;

    @GetMapping("/")
    public String okayResponse(){
        return "okay";
    }

    @GetMapping("/bible-data-endpoints-feign/bible")
    public JSONObject retrieveBibleJsonFeign(){

        JSONObject response = proxy.retrieveBibleJson();

        return response;
    }
}

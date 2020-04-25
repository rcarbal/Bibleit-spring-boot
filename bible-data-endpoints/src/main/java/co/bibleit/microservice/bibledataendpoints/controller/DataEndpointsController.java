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

    @GetMapping("/test")
    public String okayResponse(){
        return "ok - rfV4";
    }

    @GetMapping("/bible-data-endpoints/bible")
    public JSONObject retrieveBibleJsonFeign(){

        JSONObject response = proxy.retrieveBibleJson();

        return response;
    }
}

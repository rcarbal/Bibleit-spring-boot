package co.bibleit.springboot.controller;

import co.bibleit.springboot.service.BibleJSONService;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BiApiController {

    private BibleJSONService jsonService;

    @Autowired
    public BiApiController(BibleJSONService jsonService) {
        this.jsonService = jsonService;
    }

    @GetMapping("/bible")
    public JSONObject sections(){
        return jsonService.getAll();
    }
}

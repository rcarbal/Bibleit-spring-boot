package co.bibleit.springboot.service;

import co.bibleit.springboot.dao.json.BibleJSONDAO;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BibleJSONServiceImp implements BibleJSONService{


    private BibleJSONDAO jsonService;

    @Autowired
    public BibleJSONServiceImp(BibleJSONDAO jsonService) {
        this.jsonService = jsonService;
    }

    public BibleJSONServiceImp() {
    }


    @Override
    public JSONObject getAll() {
        return jsonService.getAll();
    }
}

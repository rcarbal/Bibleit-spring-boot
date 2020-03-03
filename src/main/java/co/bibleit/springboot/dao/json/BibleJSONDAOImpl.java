package co.bibleit.springboot.dao.json;

import co.bibleit.springboot.bibleJson.classes.BibleJson;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BibleJSONDAOImpl implements BibleJSONDAO{

    @Autowired
    private BibleJson bibleJson;

    public BibleJSONDAOImpl() {
    }

    @Override
    public JSONObject getAll() {
        return bibleJson.getParsedBibleJSON();
    }
}

package co.bibleit.microservice.dataparser.bibledataparser.dao;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

@Component
public class BibleJSONDaoImpl implements BibleJSONDao {

    private final String PATH = "src/main/resources/json/english/NIV.json";
    private boolean parsed = false;
    private JSONObject parsedBibleJSON;

    public BibleJSONDaoImpl() {
        setupScriptureCollection();
    }



    @Override
    public JSONObject getBible() {
        return parsedBibleJSON;
    }

    public void setupScriptureCollection() {
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader(PATH)){

            // get json data
            Object obj = jsonParser.parse(reader);
            parsedBibleJSON = (JSONObject) obj;

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        parsed = true;
    }
}

package co.bibleit.microservice.biblejsonparser.dao;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Component
public class BibleJSONDaoImpl implements BibleJSONDao {

    @Autowired
    ResourceLoader resourceLoader;
    private JSONObject parsedBibleJSON;

    public BibleJSONDaoImpl() {
        setupScriptureCollection();
    }

    @Override
    public JSONObject getBible() {
        return parsedBibleJSON;
    }

    public void setupScriptureCollection() {
//JSONObject jsonObject = (JSONObject)jsonParser.parse(
//      new InputStreamReader(inputStream, "UTF-8"))

        Resource resource = new ClassPathResource("bible-niv.json");
        JSONParser jsonParser = new JSONParser();
//        File nivFile = new File(getClass().getClassLoader().getResource("bible-niv.json").getFile());


        try {
            InputStream input = resource.getInputStream();
            // get json data
            parsedBibleJSON = (JSONObject) jsonParser.parse(new InputStreamReader(input, "UTF-8"));

            input.close();

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }


    }
}

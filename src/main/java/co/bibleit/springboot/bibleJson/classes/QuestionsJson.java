package co.bibleit.springboot.bibleJson.classes;

import co.bibleit.springboot.bibleJson.interfaces.JsonProcessor;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class QuestionsJson implements JsonProcessor {

    private final String PATH = "src/main/resources/json/questions/bible_question.json";

    @Override
    public void getKey() {

    }

    @Override
    public List<String> getJsonList(String key) {
        List<String> questions = new ArrayList<>();

        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = null;
        JSONArray jsonArray = null;

            try (FileReader reader = new FileReader(PATH)){
                jsonObject = (JSONObject) jsonParser.parse(reader);
                jsonArray = (JSONArray) jsonObject.get("questions");

                for (int i = 0 ; i <jsonArray.size(); i++){
                    JSONObject question = (JSONObject) jsonArray.get(i);
                    String questionString = (String) question.get("question");
                    questions.add(questionString);

                }

            } catch (IOException | ParseException e) {
                e.printStackTrace();
            }

        return questions;
    }
}

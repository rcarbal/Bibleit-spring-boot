package co.bibleit.springboot.bibleJson.classes;

import co.bibleit.springboot.bibleJson.interfaces.JsonProcessor;
import co.bibleit.springboot.utilities.questions.BibleQuestions;
import co.bibleit.springboot.utilities.questions.Questions;
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
    public List<Questions> getJsonList(String key) {
        List<Questions> questions = new ArrayList<>();

        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = null;
        JSONArray jsonArray = null;

            try (FileReader reader = new FileReader(PATH)){
                jsonObject = (JSONObject) jsonParser.parse(reader);
                jsonArray = (JSONArray) jsonObject.get("questions");

                for (int i = 0 ; i <jsonArray.size(); i++){
                    JSONObject question = (JSONObject) jsonArray.get(i);
                    String questionString = (String) question.get("question");
                    String answerString = (String) question.get("answer");

                    Questions questionAndAnswer = new BibleQuestions(questionString, answerString);

                    questions.add(questionAndAnswer);

                }

            } catch (IOException | ParseException e) {
                e.printStackTrace();
            }

        return questions;
    }
}

package co.bibleit.springboot.bibleJson.interfaces;

import co.bibleit.springboot.utilities.questions.Questions;

import java.util.List;

public interface JsonProcessor {

    void getKey();

    List<Questions> getJsonList(String keys);
}

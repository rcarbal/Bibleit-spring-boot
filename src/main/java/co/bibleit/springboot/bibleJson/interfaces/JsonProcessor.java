package co.bibleit.springboot.bibleJson.interfaces;

import java.util.List;

public interface JsonProcessor {

    void getKey();

    List<String> getJsonList(String keys);
}

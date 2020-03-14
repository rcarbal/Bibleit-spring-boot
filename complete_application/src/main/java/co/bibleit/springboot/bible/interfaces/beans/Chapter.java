package co.bibleit.springboot.bible.interfaces.beans;

import java.util.Map;

public interface Chapter {

    String getVerse(String verse);

    Map<String, String> getAllVerses();

    String getChapterNumber();
}

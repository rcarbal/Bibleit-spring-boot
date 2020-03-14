package co.bibleit.springboot.bibleJson.interfaces;

import co.bibleit.springboot.bible.interfaces.beans.Chapter;
import co.bibleit.springboot.bible.interfaces.beans.ScriptureCollection;

import java.util.List;
import java.util.Map;

public interface BookJsonProcessor {
    void setupScriptureCollection();

    List<String> getBookStringNames();

    Map<String, Chapter> getBook(String bibleBook);

    Chapter getChapter(Map<String, Chapter> book, String chapter);

    ScriptureCollection getBible();


}

package co.bibleit.springboot.bibleJson;

import co.bibleit.springboot.bible.Chapter;
import co.bibleit.springboot.bible.ScriptureCollection;

import java.util.List;
import java.util.Map;

public interface JsonProcessor {
    void setupScriptureCollection();

    List<String> getBookStringNames();

    List<String> getChaptersString();

    Map<String, Chapter> getBook(String bibleBook);

    void getVerses(String book, String chapter);

    ScriptureCollection getBible();


}

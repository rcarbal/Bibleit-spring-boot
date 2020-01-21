package co.bibleit.springboot.bibleJson;

import co.bibleit.springboot.bible.Book;
import co.bibleit.springboot.bible.ScriptureCollection;

import java.util.List;

public interface JsonProcessor {
    void setupScriptureCollection();

    List<String> getBibleBookStringNames();

    Book getBook(String bibleBook);

    void getVerses(String book, String chapter);

    ScriptureCollection getBible();


}

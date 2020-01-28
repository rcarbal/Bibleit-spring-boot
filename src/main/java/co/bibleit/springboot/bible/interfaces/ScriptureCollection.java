package co.bibleit.springboot.bible.interfaces;

import java.util.Map;

public interface ScriptureCollection {

    Map<String, Book> getScriptureCollectionBooks();

    String getName();

    void setName(String name);
}

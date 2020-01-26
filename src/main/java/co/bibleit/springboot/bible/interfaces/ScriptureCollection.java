package co.bibleit.springboot.bible.interfaces;

import java.util.HashMap;

public interface ScriptureCollection {

    HashMap<String, Book> getScriptureCollectionBooks();

    String getName();

    void setName(String name);
}

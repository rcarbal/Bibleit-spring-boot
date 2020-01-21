package co.bibleit.springboot.bible;

import java.util.HashMap;

public class HolyBible implements ScriptureCollection {

    private HashMap<String, Book> bibleBooks;

    public HolyBible(HashMap<String, Book> bibleBooks) {
        this.bibleBooks = bibleBooks;
    }

    @Override
    public HashMap<String, Book> getScriptureCollectionBooks() {
        return new HashMap<>(bibleBooks);
    }
}

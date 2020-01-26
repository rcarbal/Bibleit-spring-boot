package co.bibleit.springboot.bible;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class HolyBible implements ScriptureCollection {

    private Map<String, Book> bibleBooks;

    public HolyBible(Map<String, Book> bibleBooks) {
        this.bibleBooks = bibleBooks;
    }

    @Override
    public HashMap<String, Book> getScriptureCollectionBooks() {
        return new HashMap<>(bibleBooks);
    }
}

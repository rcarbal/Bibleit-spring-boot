package co.bibleit.springboot.bible.classes;

import co.bibleit.springboot.bible.interfaces.Book;
import co.bibleit.springboot.bible.interfaces.ScriptureCollection;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class HolyBible implements ScriptureCollection {

    private String name;
    private Map<String, Book> bibleBooks;

    public HolyBible(Map<String, Book> bibleBooks) {
        this.bibleBooks = bibleBooks;
    }

    @Override
    public HashMap<String, Book> getScriptureCollectionBooks() {
        return new HashMap<>(bibleBooks);
    }

    @Override
    public String getName() {
        System.out.println("Getting current bible verions from " + getClass().getName());
        return this.name;
    }

    @Override
    public void setName(String name) {
        System.out.println("Setting current bible verions from " + getClass().getName());
        this.name = name;
    }
}

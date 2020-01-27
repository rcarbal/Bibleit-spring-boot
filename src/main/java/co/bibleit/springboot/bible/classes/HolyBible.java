package co.bibleit.springboot.bible.classes;

import co.bibleit.springboot.bible.interfaces.Book;
import co.bibleit.springboot.bible.interfaces.ScriptureCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class HolyBible implements ScriptureCollection {

    @Autowired
    @Qualifier("bibleContainer")
    private Map<String, Book> bibleBooks;

    @Value("${bible.version.name}")
    private String name;

    /*
    @Autowired
    public HolyBible(Map<String, Book> bibleBooks) {
        this.bibleBooks = bibleBooks;
    }
    */

    // if not using constructor injection you setup a no-arg constructor for dependency injection through setter methods.
    public HolyBible() {
        System.out.println(">> Inside defualt constructor");
    }

    /*
    @Autowired
    public void setBibleBooks(Map<String, Book> bibleBooks){
        System.out.println(">> bibleBooks set by autowired setBibleBooks() method.");
        this.bibleBooks = bibleBooks;
    }
     */

    @Override
    public HashMap<String, Book> getScriptureCollectionBooks() {
        return new HashMap<>(bibleBooks);
    }

    @Override
    public String getName() {
        System.out.println("Getting current bible versions from " + getClass().getName());
        return this.name;
    }

    @Override
    public void setName(String name) {
        System.out.println("Setting current bible versions from " + getClass().getName());
        this.name = name;
    }
}

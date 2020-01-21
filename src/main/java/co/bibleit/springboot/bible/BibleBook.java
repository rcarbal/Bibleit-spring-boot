package co.bibleit.springboot.bible;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class BibleBook implements Book{

    private Chapter bookChapters;

    @Autowired
    public BibleBook(Chapter bookChapters) {
        this.bookChapters = bookChapters;
    }

    @Override
    public HashMap<String, Chapter> getChapter() {
        return null;
    }

    @Override
    public Chapter getAllChapters() {
        return this.bookChapters;
    }
}

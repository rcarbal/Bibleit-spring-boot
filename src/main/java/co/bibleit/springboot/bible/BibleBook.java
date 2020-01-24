package co.bibleit.springboot.bible;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class BibleBook implements Book{

    private Map<String, Chapter> bookChapters;

    public BibleBook() {
    }

    @Override
    public HashMap<String, Chapter> getChapter() {
        return null;
    }

    @Override
    public Map<String, Chapter> getAllChapters() {
        return this.bookChapters;
    }
}

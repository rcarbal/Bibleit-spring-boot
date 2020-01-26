package co.bibleit.springboot.bible.interfaces;

import java.util.Map;

public interface Book {

    public Chapter getChapter(String chapter);

    public Map<String, Chapter> getAllChapters();

    public String getBookName();
}

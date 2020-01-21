package co.bibleit.springboot.bible;

import java.util.HashMap;

public interface Book {

    public HashMap<String, Chapter> getChapter();

    public Chapter getAllChapters();
}

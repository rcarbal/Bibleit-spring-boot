package co.bibleit.springboot.bible;

import java.util.HashMap;
import java.util.Map;

public interface Book {

    public HashMap<String, Chapter> getChapter();

    public Map<String, Chapter> getAllChapters();
}

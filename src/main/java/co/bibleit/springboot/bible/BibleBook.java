package co.bibleit.springboot.bible;

import java.util.Map;


public class BibleBook implements Book{

    private String name;
    private Map<String, Chapter> chapters;

    public BibleBook(String name, Map<String, Chapter> chapters) {
        this.name = name;
        this.chapters = chapters;
    }

    @Override
    public Chapter getChapter(String chapter) {
        return chapters.get(chapter);
    }

    @Override
    public Map<String, Chapter> getAllChapters() {
        return this.chapters;
    }

    @Override
    public String getBookName() {
        return this.name;
    }
}

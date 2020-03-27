package co.bibleit.springboot.bible.classes.beans;

import co.bibleit.springboot.bible.interfaces.beans.Book;
import co.bibleit.springboot.bible.interfaces.beans.Chapter;

import java.util.Map;


public class BibleBookBean implements Book {

    private String name;
    private Map<String, Chapter> chapters;

    public BibleBookBean(String name, Map<String, Chapter> chapters) {
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

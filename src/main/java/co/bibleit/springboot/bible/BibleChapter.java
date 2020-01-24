package co.bibleit.springboot.bible;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class BibleChapter implements Chapter {

    private String chapterNumber;
    private Map<String, String> verses;

    public BibleChapter() {
    }

    public void setChapterNumber(String chapterNumber) {
        this.chapterNumber = chapterNumber;
    }

    @Override
    public String getVerse(String verse) {
        return null;
    }

    @Override
    public void getAllVerses() {

    }

    @Override
    public String getChapterNumber() {
        return this.chapterNumber;
    }

    public void setVerses(Map<String, String> verses){
        this.verses = verses;
    }
}

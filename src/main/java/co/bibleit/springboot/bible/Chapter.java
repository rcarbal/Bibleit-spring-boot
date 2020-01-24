package co.bibleit.springboot.bible;

public interface Chapter {

    String getVerse(String verse);

    void getAllVerses();

    String getChapterNumber();
}

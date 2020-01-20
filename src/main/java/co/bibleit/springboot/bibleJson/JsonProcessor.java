package co.bibleit.springboot.bibleJson;

import java.util.List;

public interface JsonProcessor {
    void setupJson();

    public List<String> getBibleBooks();

    public List<String> getBookChapters(String bibleBook);

    public void getVerses(String book, String chapter);
}

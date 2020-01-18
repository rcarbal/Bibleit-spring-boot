package co.bibleit.springboot.bibleJson;

import java.util.ArrayList;
import java.util.List;

public class BibleJson implements JsonProcessor {

    @Override
    public List<String> getBibleBooks() {
        ArrayList<String> bibleBooks = new ArrayList<>();
        bibleBooks.add("Genesis");

        return bibleBooks;
    }

    @Override
    public List<String> getBookChapters(String bibleBook) {
        return null;
    }

    @Override
    public void getVerses(String book, String chapter) {

    }
}

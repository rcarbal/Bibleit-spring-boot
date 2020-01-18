package co.bibleit.springboot.bibleJson;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class JsonProcessTest {

    @Test
    public void getBibleBooksFromJsonFile(){
        BibleJson bibleInfo = new BibleJson();
        List<String> allTheBooksInTheBible = bibleInfo.getBibleBooks();

        assertNotNull(bibleInfo);
        assertTrue(allTheBooksInTheBible.size() > 0);


    }

}
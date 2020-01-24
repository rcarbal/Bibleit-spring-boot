package co.bibleit.springboot.bibleJson;

import co.bibleit.springboot.bible.Chapter;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class JsonProcessTest {

    @Test
    public void getBibleBooksNamesStringsFromJsonFile(){
        // find the application context file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // get bean
        JsonProcessor jsonProcessor = context.getBean("bibleJson", JsonProcessor.class);

        List<String> allTheBooksInTheBible = jsonProcessor.getBookStringNames();
        context.close();

        for (String book: allTheBooksInTheBible){
            System.out.println(book);
        }

        assertNotNull(jsonProcessor);
        assertEquals(allTheBooksInTheBible.size(), 66);
    }

    @Test
    public void getSingleBibleBooktFromJsonFile(){
        // find the application context file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // get bean
        JsonProcessor jsonProcessor = context.getBean("bibleJson", JsonProcessor.class);

        Map<String, Chapter> chaptersInABook = jsonProcessor.getBook("Genesis");

        assertNotNull(chaptersInABook);

        // assert for Genesis length
        assertEquals(chaptersInABook.size(), 50);
    }

    @Test
    public void getBibleChaptersFromJsonFile(){
        // find the application context file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // get bean
        JsonProcessor jsonProcessor = context.getBean("bibleJson", JsonProcessor.class);

        // get a book that contains all the chapters
        Map<String, Chapter> bookOfRevelation = jsonProcessor.getBook("Revelation");
        String chapterToRetrieve = "1";

        Chapter chapterFromRevelation = jsonProcessor.getChapter(bookOfRevelation,chapterToRetrieve);
        context.close();

        assertNotNull(chapterFromRevelation);
        assertEquals(chapterFromRevelation.getAllVerses().size(), 20);
    }

}
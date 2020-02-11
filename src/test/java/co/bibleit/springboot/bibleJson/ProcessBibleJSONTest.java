package co.bibleit.springboot.bibleJson;

import co.bibleit.springboot.bible.interfaces.beans.Chapter;
import co.bibleit.springboot.bibleJson.interfaces.BookJsonProcessor;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProcessBibleJSONTest {

    @Test
    public void getBibleBooksNamesStringsFromJsonFile(){
        // find the application context file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // get bean
        BookJsonProcessor bookJsonProcessor = context.getBean("bibleJson", BookJsonProcessor.class);

        List<String> allTheBooksInTheBible = bookJsonProcessor.getBookStringNames();

        for (String book: allTheBooksInTheBible){
            System.out.println(book);
        }

        assertNotNull(bookJsonProcessor);
        assertEquals(allTheBooksInTheBible.size(), 66);

        context.close();
    }

    @Test
    public void getSingleBibleBookFromJsonFile(){
        // find the application context file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // get bean
        BookJsonProcessor bookJsonProcessor = context.getBean("bibleJson", BookJsonProcessor.class);

        Map<String, Chapter> chaptersInABook = bookJsonProcessor.getBook("Genesis");

        assertNotNull(chaptersInABook);

        // assert for Genesis length
        assertEquals(chaptersInABook.size(), 50);
        context.close();
    }

    @Test
    public void getBibleChaptersFromJsonFile(){
        // find the application context file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // get bean
        BookJsonProcessor bookJsonProcessor = context.getBean("bibleJson", BookJsonProcessor.class);

        // get a book that contains all the chapters
        Map<String, Chapter> bookOfRevelation = bookJsonProcessor.getBook("Revelation");
        String chapterToRetrieve = "1";

        Chapter chapterFromRevelation = bookJsonProcessor.getChapter(bookOfRevelation,chapterToRetrieve);

        assertNotNull(chapterFromRevelation);
        assertEquals(chapterFromRevelation.getAllVerses().size(), 20);

        context.close();
    }
}
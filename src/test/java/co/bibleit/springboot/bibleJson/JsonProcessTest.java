package co.bibleit.springboot.bibleJson;

import co.bibleit.springboot.bible.Book;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class JsonProcessTest {

    @Test
    public void getBibleBooksNamesFromJsonFile(){
        // find the application context file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // get bean
        JsonProcessor jsonProcessor = context.getBean("bibleJson", JsonProcessor.class);

        List<String> allTheBooksInTheBible = jsonProcessor.getBibleBookStringNames();
        context.close();

        assertNotNull(jsonProcessor);
        assertEquals(allTheBooksInTheBible.size(), 66);
    }

    @Test
    public void getBibleChaptersFromJsonFile(){
        // find the application context file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // get bean
        JsonProcessor jsonProcessor = context.getBean("bibleJson", JsonProcessor.class);

        // get a book that contains all the chapters
        Book bookOfGenes = jsonProcessor.getBook("Genesis");
        context.close();

//        assertNotNull(bookOfGenes);
//        assertEquals(bookOfGenes.getChapters().size, 50);
    }

}
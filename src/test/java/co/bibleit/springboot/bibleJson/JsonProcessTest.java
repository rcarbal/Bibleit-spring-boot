package co.bibleit.springboot.bibleJson;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

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
    public void getSingleBibleBookStringListFromJsonFile(){
        // find the application context file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // get bean
        JsonProcessor jsonProcessor = context.getBean("bibleJson", JsonProcessor.class);

        List<String> chaptersInABook = jsonProcessor.getBook("Genesis");

        assertNotNull(chaptersInABook);

        // assert for Genesis 3
        assertEquals(chaptersInABook.size(), 50);
    }

    @Test
    public void getBibleChaptersFromJsonFile(){
        // find the application context file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // get bean
        JsonProcessor jsonProcessor = context.getBean("bibleJson", JsonProcessor.class);

        // get a book that contains all the chapters
        List<String> bookOfGenes = jsonProcessor.getBook("Genesis");
        context.close();

//        assertNotNull(bookOfGenes);
//        assertEquals(bookOfGenes.getChapters().size, 50);
    }

}
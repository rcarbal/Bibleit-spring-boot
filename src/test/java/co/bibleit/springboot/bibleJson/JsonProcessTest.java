package co.bibleit.springboot.bibleJson;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JsonProcessTest {

    @Test
    public void getBibleBooksFromJsonFile(){
        // find the application context file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // get bean
        JsonProcessor jsonProcessor = context.getBean("bibleJson", JsonProcessor.class);

        List<String> allTheBooksInTheBible = jsonProcessor.getBibleBooks();
        context.close();

        assertNotNull(jsonProcessor);
        assertEquals(allTheBooksInTheBible.size(), 66);
    }

    @Test
    public void getBibleChaptersFromJsonFile(){

    }

}
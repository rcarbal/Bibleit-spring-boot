package co.bibleit.springboot.bible;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BibleDataBuilderTest {

    // This class is made to build an bible data container that can be injected
    @Test
    public void buildCompleteBibleObject(){
        // find the application context file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        ScriptureCollection completeBibleInformationContainer = context.getBean("holyBible", ScriptureCollection.class);

        assertNotNull(completeBibleInformationContainer);
        assertTrue(completeBibleInformationContainer.getScriptureCollectionBooks().containsKey("Genesis"));

        context.close();


    }
}

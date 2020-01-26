package co.bibleit.springboot.bible;

import co.bibleit.springboot.bible.interfaces.ScriptureCollection;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void getCompleteBibleVersionNameFromPropertyFile(){
        // find the application context file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        ScriptureCollection completeBibleInformationContainer = context.getBean("holyBible", ScriptureCollection.class);

        assertNotNull(completeBibleInformationContainer);
        assertEquals(completeBibleInformationContainer.getName(), "New International Version");

        System.out.println(completeBibleInformationContainer.getName());
        context.close();
    }
}

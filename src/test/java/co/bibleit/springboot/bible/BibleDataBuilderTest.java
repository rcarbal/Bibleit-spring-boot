package co.bibleit.springboot.bible;

import co.bibleit.springboot.bible.interfaces.ScriptureCollection;
import co.bibleit.springboot.configurations.BibleitConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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

    @Test
    public void buildCompleteBibleObjectUsingJavaConfigFile(){
        // find the application context file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BibleitConfig.class);

        ScriptureCollection completeBibleInformationContainer = context.getBean("scriptureCollection", ScriptureCollection.class);

        assertNotNull(completeBibleInformationContainer);
        assertTrue(completeBibleInformationContainer.getScriptureCollectionBooks().containsKey("Genesis"));

        System.out.println(">> Printing the complete bible object");
        System.out.println(completeBibleInformationContainer);
        System.out.println("\n");

        context.close();
    }
}

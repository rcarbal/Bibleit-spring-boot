package co.bibleit.springboot.bible;

import co.bibleit.springboot.bible.interfaces.beans.ScriptureCollection;
import co.bibleit.springboot.configurations.BibleitConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BibleDataBuilderTest {

    private AnnotationConfigApplicationContext context;

    @BeforeEach
    public void setupSpringContextObject(){
        // find the application context file
        System.out.println("Setting up Spring Context Object");
        context = new AnnotationConfigApplicationContext(BibleitConfig.class);
    }

    // This class is made to build an bible data container that can be injected
    @Test
    public void buildCompleteBibleObject(){

        ScriptureCollection completeBibleInformationContainer = context.getBean("holyBible", ScriptureCollection.class);

        Assertions.assertNotNull(completeBibleInformationContainer);
        Assertions.assertTrue(completeBibleInformationContainer.getScriptureCollectionBooks().containsKey("Genesis"));
    }

    @Test()
    public void bibleDataContainerShouldThrowExceptionIfKeyIsNull(){
        ScriptureCollection completeBibleInformationContainer = context.getBean("holyBible", ScriptureCollection.class);

        Assertions.assertThrows(IllegalArgumentException.class, () -> completeBibleInformationContainer
                .getScriptureCollectionBooks().containsKey(""));
    }

    @Test
    public void getCompleteBibleVersionNameFromPropertyFile(){

        ScriptureCollection completeBibleInformationContainer = context.getBean("holyBible", ScriptureCollection.class);

        Assertions.assertNotNull(completeBibleInformationContainer);
        Assertions.assertEquals(completeBibleInformationContainer.getName(), "New International Version");

        System.out.println(completeBibleInformationContainer.getName());
    }

    @Test
    public void buildCompleteBibleObjectUsingJavaConfigFile(){

        ScriptureCollection completeBibleInformationContainer = context.getBean("holyBible", ScriptureCollection.class);

        Assertions.assertNotNull(completeBibleInformationContainer);
        Assertions.assertTrue(completeBibleInformationContainer.getScriptureCollectionBooks().containsKey("Genesis"));

        System.out.println(">> Printing the complete bible object");
        System.out.println(completeBibleInformationContainer);
        System.out.println("\n");
    }

    @AfterEach
    public void closeSpringContainer(){
        System.out.println("Closing Spring Context");
        context.close();
    }
}

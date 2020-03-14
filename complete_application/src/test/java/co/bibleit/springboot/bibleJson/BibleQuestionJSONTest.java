package co.bibleit.springboot.bibleJson;

import co.bibleit.springboot.bibleJson.interfaces.JsonProcessor;
import co.bibleit.springboot.configurations.BibleitConfig;
import co.bibleit.springboot.utilities.questions.Questions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class BibleQuestionJSONTest {

    private AnnotationConfigApplicationContext context;

    @BeforeEach
    public void setupSpringContextObject(){
        // find the application context file
        System.out.println("Setting up Spring Context Object");
        context = new AnnotationConfigApplicationContext(BibleitConfig.class);
    }

    @Test
    public void getAllTheQuestionsFromQuestionFile(){
        JsonProcessor jsonProcessor = context.getBean("questionJsonProcessor", JsonProcessor.class);

        String key = "QUESTION";
        List<Questions> bibleQuestionFromJsonFile = jsonProcessor.getJsonList(key);

        Assertions.assertTrue(bibleQuestionFromJsonFile.size() > 0);
    }

    @AfterEach
    public void closeSpringContainer(){
        System.out.println("Closing Spring Context");
        context.close();
    }
}

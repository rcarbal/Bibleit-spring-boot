package co.bibleit.springboot.aop;

import co.bibleit.springboot.configurations.DemoConfig;
import co.bibleit.springboot.examples.aop.dao.ExampleDAO;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAOPTest {

    @Test
    public void test(){

        //read the configuration
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        // get the bean from the spring container
        ExampleDAO theExampleDAO = context.getBean("exampleDAO", ExampleDAO.class);

        // call the bussiness method
        theExampleDAO.addAccount();

        // close the context
        context.close();
    }
}

package co.bibleit.springboot.aop;

import co.bibleit.springboot.configurations.DemoConfig;
import co.bibleit.springboot.examples.aop.dao.AccountDAO;
import co.bibleit.springboot.examples.aop.dao.MembershipDAO;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAOPTest {

    @Test
    public void runPointcutOnAccountDAOAddAccountMethod(){

        //read the configuration
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        // get the bean from the spring container
        AccountDAO theExampleDAO = context.getBean("accountDAO", AccountDAO.class);
        MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

        // call the business method
        theExampleDAO.addAccount();

        // call the membership
        theMembershipDAO.addAccount();
        theMembershipDAO.addSilly();

        // close the context
        context.close();
    }
}

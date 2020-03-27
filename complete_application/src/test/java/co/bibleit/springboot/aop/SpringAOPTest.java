package co.bibleit.springboot.aop;

import co.bibleit.springboot.configurations.DemoConfig;
import co.bibleit.springboot.examples.aop.Account;
import co.bibleit.springboot.examples.aop.dao.AccountDAO;
import co.bibleit.springboot.examples.aop.dao.AccountWithArgsDAO;
import co.bibleit.springboot.examples.aop.dao.MembershipDAO;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

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

    @Test
    public void runPointCutOnAccountWithAgrsDAOMethod(){
        //read the configuration
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        // get the bean from the spring container

        AccountWithArgsDAO theExampleDAO = context.getBean("accountWithArgsDAO", AccountWithArgsDAO.class);


        MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
        Account theAccount = new Account();

        // call the business method
        System.out.println("\nrunning AccountWithArgsDAO.class call");
        theExampleDAO.addAccount(theAccount, true);

        // call the membership
        System.out.println("\nrunning MembershipDAO.class call");
        theMembershipDAO.addAccount();
        theMembershipDAO.addSilly();

        // close the context
        context.close();
    }

    @Test
    public void matchOnAnyMethodInsideAPackage(){
        //read the configuration
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        // get the bean from the spring container

        AccountWithArgsDAO theExampleDAO = context.getBean("accountWithArgsDAO", AccountWithArgsDAO.class);
        AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
        theAccountDAO.doWork();


        MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
        Account theAccount = new Account();


        // call the business method
        System.out.println("\nrunning AccountWithArgsDAO.class call");
        theExampleDAO.addAccount(theAccount, true);

        // call the membership
        System.out.println("\nrunning MembershipDAO.class call");
        theMembershipDAO.addAccount();
        theMembershipDAO.addSilly();

        // close the context
        context.close();
    }

    @Test
    public void callGetterAndSettersWithPointCutDeclarations(){
        //read the configuration
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        // get the bean from the spring container

        AccountWithArgsDAO theExampleDAO = context.getBean("accountWithArgsDAO", AccountWithArgsDAO.class);
        AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
        theAccountDAO.doWork();



        // call the getter and setter methods.
        theAccountDAO.setName("FOOBAR");
        theAccountDAO.setServiceCode("Silver");

        String name = theAccountDAO.getName();
        String serviceCode = theAccountDAO.getServiceCode();


        MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
        Account theAccount = new Account();
        theAccount.setName("Ricardo");
        theAccount.setLevel("Admin");


        // call the business method
        System.out.println("\nrunning AccountWithArgsDAO.class call");
        theExampleDAO.addAccount(theAccount, true);

        // call the membership
        System.out.println("\nrunning MembershipDAO.class call");
        theMembershipDAO.addAccount();
        theMembershipDAO.addSilly();

        // close the context
        context.close();
    }

    @Test
    public void afterReturningFromPoincutExpression(){
        //read the configuration
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        // get the bean from the spring container
        AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

        List<Account> theAccounts = theAccountDAO.findAccounts();

        System.out.println("\n\nAfterReturningFromPointcutExpression");
        System.out.println("----");
        System.out.println(theAccounts);
        System.out.println("\n");

        // close the context
        context.close();
    }
}

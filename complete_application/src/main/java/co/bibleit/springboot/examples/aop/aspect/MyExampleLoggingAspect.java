package co.bibleit.springboot.examples.aop.aspect;

import co.bibleit.springboot.examples.aop.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
@Order(2)
public class MyExampleLoggingAspect {

    //add new advice for @AfterReturning on the findAccounts method

    @AfterReturning(
            pointcut = "execution(* co.bibleit.springboot.examples.aop.dao.AccountDAO.findAccounts(..))",
            returning = "result"
    )
    public void afterReturningFindAccountAdvice(JoinPoint theJoinPoint, List<Account> result){
        // print out which method we are advising on
        String method= theJoinPoint.getSignature().toShortString();
        System.out.println("\n====>>>>> Executing @AfterReturning on method: "  + method);
        // print out the results of the method call
        System.out.println("\n====>>>>> result is " + result);
    }


    @Before("co.bibleit.springboot.examples.aop.aspect.LuvAOPExpressions.forDAOPackageNoGetterSetter()")
    public void beforeAnyMethodInsideAPackage(JoinPoint theJoinpoint){
        System.out.println("\n=========>>> LOGGING @Before advice on ANY!!! Method inside choosen package");

        // display the method signature
        MethodSignature methodSignature = (MethodSignature) theJoinpoint.getSignature();

        System.out.println("Method: " + methodSignature);

        // display the method arguments.
        // get the arguments
        Object[] args = theJoinpoint.getArgs();

        // loop through the arguments
        for (Object tempArgs: args){
            System.out.println(tempArgs);

            if (tempArgs instanceof Account){
                // downcast and print Account specific stuff
                Account theAccount = (Account) tempArgs;

                System.out.println("account name: " + theAccount.getName());
                System.out.println("account level: " + theAccount.getLevel());
            }
        }

    }

}

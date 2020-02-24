package co.bibleit.springboot.examples.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyExampleLoggingAspect {

    // this is where we add all of our related advices.  This is aspects for logging.

    // lets start with a @Before advice.

    @Before("execution(public void addAccount())")
    public void beforeAddAccountAdvice(){
        System.out.println("\n=========>>> execting @Before advice on addAccount()");
    }
}

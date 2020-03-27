package co.bibleit.springboot.examples.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyCloudLogAsyncAspect {

    @Before("co.bibleit.springboot.examples.aop.aspect.LuvAOPExpressions.forDAOPackageNoGetterSetter()")
    public void logTocloud(){
        System.out.println("\n=========>>> Logging to Cloud in async fashion");
    }
}

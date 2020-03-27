package co.bibleit.springboot.examples.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyAPIAnalyticsAspect {

    @Before("co.bibleit.springboot.examples.aop.aspect.LuvAOPExpressions.forDAOPackageNoGetterSetter()")
    public void performAnalytics(){
        System.out.println("\n=========>>> Performing API analytics");
    }
}

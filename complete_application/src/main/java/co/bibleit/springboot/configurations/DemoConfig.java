package co.bibleit.springboot.configurations;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("co.bibleit.springboot.examples.aop")
public class DemoConfig {
}

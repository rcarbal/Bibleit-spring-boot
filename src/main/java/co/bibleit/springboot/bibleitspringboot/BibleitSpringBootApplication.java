package co.bibleit.springboot.bibleitspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("co.bibleit.springboot")
public class BibleitSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(BibleitSpringBootApplication.class, args);

    }


}

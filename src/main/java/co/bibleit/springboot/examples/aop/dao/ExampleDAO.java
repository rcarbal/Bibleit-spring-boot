package co.bibleit.springboot.examples.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class ExampleDAO {

    public void addAccount(){
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AND ACCOUNT");

    }
}

package co.bibleit.springboot.examples.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAccount(){
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AND ACCOUNT");

    }

    public boolean doWork(){
        System.out.println(getClass() + ": DOING WORK()");
        return false;
    }
}

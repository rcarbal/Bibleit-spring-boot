package co.bibleit.springboot.examples.aop.dao;

import co.bibleit.springboot.examples.aop.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountWithArgsDAO {

    public void addAccount(Account theAccount, boolean mvp) {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AND ACCOUNT with MVP");

    }

}

package co.bibleit.springboot.examples.aop.dao;

import co.bibleit.springboot.examples.aop.Account;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDAO {

    private String name;
    private String serviceCode;

    public List<Account> findAccounts(){
        List<Account> myAccount = new ArrayList<>();

        Account a1 = new Account("Tikiti", "Bronze");
        Account a2 = new Account("Baby Luv", "Silver");
        Account a3 = new Account("Ricardo", "Gold");
        Account a4 = new Account("Tito", "Platinum");

        myAccount.add(a1);
        myAccount.add(a2);
        myAccount.add(a3);
        myAccount.add(a4);

        return myAccount;
    }

    public void addAccount(){
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AND ACCOUNT");

    }

    public void addAccount(Account theAccount, boolean mvp){
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AND ACCOUNT");

    }


    public boolean doWork(){
        System.out.println(getClass() + ": DOING WORK()");
        return false;
    }

    public String getName() {
        System.out.println("Calling getName()");
        return name;
    }

    public void setName(String name) {
        System.out.println("Calling setName()");
        this.name = name;
    }

    public String getServiceCode() {
        System.out.println("Calling geServiceCode()");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println("Calling setServiceCode()");
        this.serviceCode = serviceCode;
    }
}

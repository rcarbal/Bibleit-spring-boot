package co.bibleit.springboot.examples.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    private String name;
    private String serviceCode;

    public void addAccount(){
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

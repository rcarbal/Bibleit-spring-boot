package co.bibleit.springboot.examples.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

    public void addAccount() {
        System.out.println(getClass() + ": DOING SOME STUFF: MEMBERSHIP DAO ");
    }

    public boolean addSilly() {
        System.out.println(getClass() + ": DOING SOME SILLY STUFF: MEMBERSHIP DAO");

        return true;
    }
}
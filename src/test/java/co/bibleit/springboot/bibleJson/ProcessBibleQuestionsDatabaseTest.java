package co.bibleit.springboot.bibleJson;

import co.bibleit.springboot.database.interfaces.DatabaseConnection;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProcessBibleQuestionsDatabaseTest {

    private SessionFactory factory;
    private DatabaseConnection connection;

    @BeforeEach
    public void setHibernateSessionFactory(){
        factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
        System.out.println("\n*** Hibernate Database Connection successful.***\n");
    }

    @Test
    public void saveQuestionAndAnswersInAOneToOneAssociation(){
        System.out.println();
    }


    @AfterEach
    public void closeSessionFactory(){
        factory.close();
        connection = null;

        System.out.println("\n***Hibernate connection disconnected.***\n");
    }


}

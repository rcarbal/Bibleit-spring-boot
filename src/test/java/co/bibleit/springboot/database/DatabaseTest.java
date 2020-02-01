package co.bibleit.springboot.database;

import co.bibleit.springboot.database.interfaces.DatabaseConnection;
import co.bibleit.springboot.database.mysql.MySQLConnection;
import co.bibleit.springboot.database.mysql.entities.BibleSections;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseTest {

    @Test
    public void getFirstIndexFromMySQLDatabase(){
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(BibleSections.class)
                .buildSessionFactory();
        DatabaseConnection connection = new MySQLConnection();

        int index = 1;
        BibleSections section = connection.getFromIndexDatabase(factory, index);

        factory.close();
        System.out.println();

        Assertions.assertEquals(section.getName(), "Old Testament");

    }

}

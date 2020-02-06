package co.bibleit.springboot.database;

import co.bibleit.springboot.database.interfaces.DatabaseConnection;
import co.bibleit.springboot.database.mysql.MySQLConnection;
import co.bibleit.springboot.database.mysql.entities.BibleSection;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SetupDatabaseMain {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(BibleSection.class)
                .buildSessionFactory();

        DatabaseConnection connection = new MySQLConnection();
        connection.testCreateRowInTable(factory);

    }
}

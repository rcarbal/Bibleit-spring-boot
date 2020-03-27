package co.bibleit.springboot.database;

import co.bibleit.springboot.database.mysql.entities.bible.BibleSection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SetupDatabaseMain {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(BibleSection.class)
                .buildSessionFactory();

//        DatabaseConnection connection = new MySQLConnection();
//        connection.testCreateRowInTable(factory);

        Session session = factory.getCurrentSession();
        try {
            BibleSection section = new BibleSection("Old Testament");

            session.beginTransaction();
            session.save(section);

            session.getTransaction().commit();
        }
        finally {
            factory.close();
        }

    }
}

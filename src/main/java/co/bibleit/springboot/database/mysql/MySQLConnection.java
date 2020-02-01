package co.bibleit.springboot.database.mysql;

import co.bibleit.springboot.database.interfaces.DatabaseConnection;
import co.bibleit.springboot.database.mysql.entities.BibleSections;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection implements DatabaseConnection {
    @Override
    public void connect() {
        
    }

    @Override
    public void testConnection() {
        String jdbcUrl = "jdbc:mysql://localhost:3306/bible_it?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "2Qepxniw";

        try{
            System.out.println("Connection to database. " + jdbcUrl);
            Connection connection= DriverManager.getConnection(jdbcUrl, user, password);

            System.out.println("Connection successful!!!");
        }
        catch (SQLException e){
            System.out.println("Something went wrong connection to MySQL database. " + e.getMessage());
        }
    }

    @Override
    public void testCreateRowInTable(Object object) {
        SessionFactory factory = null;

        if (object instanceof SessionFactory){
            factory = (SessionFactory) object;
        }

        Session session = null;
        if (factory != null) {
            session = factory.getCurrentSession();
        }

        try {
            // create the BibleSections object
            System.out.println("Creating a new BibleSections object.");
            BibleSections section = new BibleSections("Old Testament");
            // start a transaction
            session.beginTransaction();

            // save the student object
            System.out.println("Saving the bile section");
            session.save(section);

            //commit
            session.getTransaction().commit();
            System.out.println("done");

        }
        finally {
            factory.close();
        }
    }

    @Override
    public BibleSections getFromIndexDatabase(Object object, int index) {
        SessionFactory factory = null;

        if (object instanceof SessionFactory){
            factory = (SessionFactory) object;
        }
        Session session  = factory.getCurrentSession();
        BibleSections mySection;

        try{
            session.beginTransaction();

            mySection = session.get(BibleSections.class, index);
            System.out.println("Get complete section: "+ mySection);

            session.getTransaction().commit();
            System.out.println("Done");
        }finally {
            System.out.println();
        }

        return mySection;
    }
}

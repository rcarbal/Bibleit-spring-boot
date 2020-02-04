package co.bibleit.springboot.database;

import co.bibleit.springboot.database.concretecreator.ConnectionFactory;
import co.bibleit.springboot.database.interfaces.DatabaseConnection;
import co.bibleit.springboot.database.mysql.MySQLConnection;
import co.bibleit.springboot.database.mysql.entities.BibleSections;
import co.bibleit.springboot.utilities.StringUtils;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;
import java.util.List;

public class DatabaseTest {
    private SessionFactory factory;
   private DatabaseConnection connection;

    @BeforeEach
    public void setHibernateSessionFactory(){
        factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(BibleSections.class)
                .buildSessionFactory();
    }

    @Test
    public void getFirstIndexFromMySQLDatabase(){

        DatabaseConnection connection = new MySQLConnection();

        int index = 1;
        BibleSections section = connection.getFromIndexDatabase(factory, index);
        System.out.println();

        Assertions.assertEquals(section.getName(), "Old Testament");

    }


    @Test
    public void getListFromBibleItSectionsTableUsingSQLString(){
         connection= ConnectionFactory.getDatbaseConnection("MYSQL");

         // query all from a table
         String fromTable = "from BibleSections";
         String andOrQuery = "Frm BibleSections s where s.name='Some Name' OR s.name='Other Name'";
         String whereClause = "from BibleSections s where s.name='Old Testament'";
         List<BibleSections> theSections = connection.queryListFromSQLString(factory, whereClause);

        System.out.println("\n" + theSections + "\n");

         Assertions.assertTrue(theSections.size() > 0);
    }

    @Test
    public void updateRandomSectionsUsingSQLString(){
        String timestamp = new Timestamp(System.currentTimeMillis()).toString();
        connection= ConnectionFactory.getDatbaseConnection("MYSQL");

        String updatedString = "TEST " + timestamp;
        int index = 3;
        connection.updateSingleBibleSectionWithSQLString(factory, updatedString, index);

        /*
        Update a property from all the rows in a table use.
        session.createQuery("update BibleSections set tableColumn='some value').executeUpdate();
         */

        /*
        Delete:
        get the Object you want to delete.
        USE:
        session.delete(myObjectToDelete);
         */
    }

    @Test
    public void randomTest(){
        System.out.println("\n\n\n" + StringUtils.capitalize("name"));

    }

    @AfterEach
    public void closeSessionFactory(){
        factory.close();
        connection = null;
    }

}

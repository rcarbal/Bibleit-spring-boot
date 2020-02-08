package co.bibleit.springboot.database;

import co.bibleit.springboot.database.concretecreator.ConnectionFactory;
import co.bibleit.springboot.database.interfaces.DatabaseConnection;
import co.bibleit.springboot.database.mysql.MySQLConnection;
import co.bibleit.springboot.database.mysql.entities.BibleSection;
import co.bibleit.springboot.database.mysql.entities.DatabaseEntity;
import co.bibleit.springboot.utilities.BibleStaticInfo;
import co.bibleit.springboot.utilities.StringUtils;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class DatabaseTest {
    private SessionFactory factory;
   private DatabaseConnection connection;

    @BeforeEach
    public void setHibernateSessionFactory(){
        factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(BibleSection.class)
                .buildSessionFactory();
    }

    @Test
    public void saveANewTestamentToDatabase(){
        connection= ConnectionFactory.getDatabaseConnection("MYSQL");

        connection.testCreateRowInTable(factory);
    }

    @Test
    public void checkBibleSectionsAreSavedToMySQLDatabase(){
        // get the bible section
        connection= ConnectionFactory.getDatabaseConnection("MYSQL");

//         check if sections are already in the database.
        String databaseQuery = "from BibleSection s where s.name='Old Testament'";
        List areThereAnySectionsInTheDatabase = connection.queryListFromSQLString(factory, databaseQuery);

        if (areThereAnySectionsInTheDatabase.size() > 1){
            Assertions.assertTrue(true);
        }else{
            // Prepare entities to be inserted
            List<DatabaseEntity> entities = new ArrayList<>();
            String[] bibleSections = BibleStaticInfo.getBibleSections();

            for (String section : bibleSections){
                BibleSection bibleSection = new BibleSection();
                bibleSection.setName(section);
                entities.add(bibleSection);
            }

            // insert to database
            int multipleEntitiesSaved = connection.saveMultipleObjects(factory, entities);

            Assertions.assertTrue(multipleEntitiesSaved > 0);
        }

    }

    @Test
    public void getFirstIndexFromMySQLDatabase(){

        DatabaseConnection connection = new MySQLConnection();

        int index = 1;
        BibleSection section = connection.getFromIndexDatabase(factory, index);
        System.out.println();

        Assertions.assertEquals(section.getName(), "Old Testament");

    }


    @Test
    public void getListFromBibleItSectionsTableUsingSQLString(){
         connection= ConnectionFactory.getDatabaseConnection("MYSQL");

         // query all from a table
         String fromTable = "from BibleSection";
         String andOrQuery = "from BibleSection s where s.name='Some Name' OR s.name='Other Name'";
         String whereClause = "from BibleSection s where s.name='Old Testament'";
         List<BibleSection> theSections = connection.queryListFromSQLString(factory, whereClause);

        System.out.println("\n" + theSections + "\n");

         Assertions.assertTrue(theSections.size() > 0);
    }

    @Test
    public void updateRandomSectionsUsingSQLString(){
        String timestamp = new Timestamp(System.currentTimeMillis()).toString();
        connection= ConnectionFactory.getDatabaseConnection("MYSQL");

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

        YOU CAN ALSO USE
        session.createQuery("delete from BibleSections where id=2");
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

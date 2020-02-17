package co.bibleit.springboot.database;

import co.bibleit.springboot.configurations.BibleitConfig;
import co.bibleit.springboot.database.concretecreator.ConnectionFactory;
import co.bibleit.springboot.database.interfaces.DatabaseConnection;
import co.bibleit.springboot.database.mysql.entities.questions.AnswerEntity;
import co.bibleit.springboot.database.mysql.entities.questions.QuestionEntity;
import co.bibleit.springboot.database.mysql.entities.questions.SuggestionEntity;
import co.bibleit.springboot.database.mysql.entities.questions.VersesEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class VerseSuggestionHIBERNATETest {

    private SessionFactory factory;
    private AnnotationConfigApplicationContext context;
    private DatabaseConnection connection;

    @BeforeEach
    public void setHibernateSessionFactory(){
        factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(QuestionEntity.class)
                .addAnnotatedClass(AnswerEntity.class)
                .addAnnotatedClass(VersesEntity.class)
                .addAnnotatedClass(SuggestionEntity.class)
                .buildSessionFactory();

        context = new AnnotationConfigApplicationContext(BibleitConfig.class);
        System.out.println("\n*** Hibernate Database Connection successful.***\n");
    }

    @Test
    public void saveSuggestionEntityAndVersesEntityManyToManyHIBERNATE(){
        Session session = factory.getCurrentSession();
        connection = ConnectionFactory.getDatabaseConnection("MYSQL");

        try{
            session.beginTransaction();

            //save the suggestion entity
            SuggestionEntity suggestionEntity = new SuggestionEntity("We need to hurry up and finish. This one id to " +
                    "associate to verses");

            System.out.println("Saving the AnswerEntity");
            session.save(suggestionEntity);
            System.out.println("Saved the SuggestionEntity with Verse Entity: " + suggestionEntity);

            // create verses
            VersesEntity v1 = new VersesEntity(1, "This is OneToMany Verse 1");
            VersesEntity v2 = new VersesEntity(2, "This is OneToMany Verse 2");

            // saving verses
            System.out.println("\nSaving VerseEntities");
            suggestionEntity.addVerse(v1);
            suggestionEntity.addVerse(v2);

            session.save(v1);
            session.save(v2);

            session.getTransaction().commit();
            System.out.println("Done");

        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            session.close();
        }

        Assertions.fail();
    }

    @AfterEach
    public void closeSessionFactory(){
        factory.close();
        connection = null;

        System.out.println("\n***Hibernate connection disconnected.***\n");
    }
}

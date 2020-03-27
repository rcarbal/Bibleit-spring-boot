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

public class SuggestionOneToManyHIBERNATE {


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
    public void createAndSaveSuggestion(){
        Session session = factory.getCurrentSession();
        connection = ConnectionFactory.getDatabaseConnection("MYSQL");

        try{
            session.beginTransaction();
            AnswerEntity answerEntity = new AnswerEntity("We need to finish now.");
            answerEntity.addSuggestion(new SuggestionEntity("You need to finish Hibernate."));
            answerEntity.addSuggestion(new SuggestionEntity("You need to master Java."));
            answerEntity.addSuggestion(new SuggestionEntity("You need to finish design patterns"));

            session.save(answerEntity);
            session.getTransaction().commit();

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

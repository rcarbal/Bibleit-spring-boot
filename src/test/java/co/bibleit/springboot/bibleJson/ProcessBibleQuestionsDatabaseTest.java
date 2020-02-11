package co.bibleit.springboot.bibleJson;

import co.bibleit.springboot.bibleJson.interfaces.JsonProcessor;
import co.bibleit.springboot.configurations.BibleitConfig;
import co.bibleit.springboot.database.concretecreator.ConnectionFactory;
import co.bibleit.springboot.database.interfaces.DatabaseConnection;
import co.bibleit.springboot.database.mysql.entities.questions.AnswerEntity;
import co.bibleit.springboot.database.mysql.entities.questions.QuestionEntity;
import co.bibleit.springboot.utilities.questions.Questions;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class ProcessBibleQuestionsDatabaseTest {

    private SessionFactory factory;
    private AnnotationConfigApplicationContext context;
    private DatabaseConnection connection;

    @BeforeEach
    public void setHibernateSessionFactory(){
        factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(QuestionEntity.class)
                .addAnnotatedClass(AnswerEntity.class)
                .buildSessionFactory();

        context = new AnnotationConfigApplicationContext(BibleitConfig.class);
        System.out.println("\n*** Hibernate Database Connection successful.***\n");
    }

    @Test
    public void saveQuestionAndAnswersInAOneToOneAssociationToDatabase(){
        // retrieve the quetions and answer
        JsonProcessor jsonProcessor = context.getBean("questionJsonProcessor", JsonProcessor.class);
        String key = "QUESTION";
        List<Questions> bibleQuestionFromJsonFile = jsonProcessor.getJsonList(key);

        Session session = factory.getCurrentSession();
        try{

            QuestionEntity question = new QuestionEntity(bibleQuestionFromJsonFile.get(0).getQuestion());
            AnswerEntity answer = new AnswerEntity(bibleQuestionFromJsonFile.get(0).getAnswer());
            session.beginTransaction();

            // associate the objects together
            answer.setQuestionEntity(question);

            // save the objects
            session.save(answer);
            System.out.println("Saving question and answer " + answer);

            session.getTransaction().commit();
        }finally{
            session.close();
            System.out.println("In finally block");
        }
    }

    @Test
    public void deleteQuestionFromTheDatabase(){

        int indexToDelete = 1;
        Session session = factory.getCurrentSession();
        connection = ConnectionFactory.getDatabaseConnection("MYSQL");

        try{
            session.beginTransaction();

            AnswerEntity questionEntity = session.get(AnswerEntity.class, 1);
            System.out.println("Found QuestionEntity: " + questionEntity);

            if (questionEntity != null){
                System.out.println("Deleting: " + questionEntity);

                session.delete(questionEntity);
                session.getTransaction().commit();
            }
        }finally {
            session.close();
        }

    }


    @AfterEach
    public void closeSessionFactory(){
        factory.close();
        connection = null;

        System.out.println("\n***Hibernate connection disconnected.***\n");
    }


}

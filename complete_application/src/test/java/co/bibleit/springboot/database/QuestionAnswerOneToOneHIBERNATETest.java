package co.bibleit.springboot.database;

import co.bibleit.springboot.bibleJson.interfaces.JsonProcessor;
import co.bibleit.springboot.configurations.BibleitConfig;
import co.bibleit.springboot.database.concretecreator.ConnectionFactory;
import co.bibleit.springboot.database.interfaces.DatabaseConnection;
import co.bibleit.springboot.database.mysql.entities.questions.AnswerEntity;
import co.bibleit.springboot.database.mysql.entities.questions.QuestionEntity;
import co.bibleit.springboot.database.mysql.entities.questions.VersesEntity;
import co.bibleit.springboot.utilities.questions.Questions;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class QuestionAnswerOneToOneHIBERNATETest {

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
            question.setAnswerEntity(answer);

            // save the objects
            session.save(question);
            System.out.println("Saving question and answer " + question);

            session.getTransaction().commit();
        }finally{
            session.close();
            System.out.println("In finally block");
        }

        Assertions.fail();
    }

    @Test
    public void deleteQuestionEntityFromTheDatabaseHIBERNATE(){

        // check the MYSQL database for proper index.
        int indexToDelete = 4;
        Session session = factory.getCurrentSession();
        connection = ConnectionFactory.getDatabaseConnection("MYSQL");

        try{
            session.beginTransaction();

            QuestionEntity questionEntity = session.get(QuestionEntity.class, indexToDelete);
            System.out.println("Found QuestionEntity: " + questionEntity);

            if (questionEntity != null){
                System.out.println("Deleting: " + questionEntity);

                session.delete(questionEntity);
                session.getTransaction().commit();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            session.close();
        }

        Assertions.fail();

    }

    @Test
    public void deleteAnswerEntityFromTheDatabaseWithRemovedAssociationToQuestionHIBERNATE(){

        // check the MYSQL database for proper index.
        int indexToDelete = 5;
        Session session = factory.getCurrentSession();
        connection = ConnectionFactory.getDatabaseConnection("MYSQL");

        try{
            session.beginTransaction();

            AnswerEntity answerEntity = session.get(AnswerEntity.class, indexToDelete);
            System.out.println("Found QuestionEntity: " + answerEntity);

            if (answerEntity != null){
                System.out.println("Deleting: " + answerEntity);

                // break the link between the AnswerEntity and the QuestionEntity
                answerEntity.getQuestionEntity().setAnswerEntity(null);

                session.delete(answerEntity);
                session.getTransaction().commit();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            session.close();
        }

        Assertions.fail();
    }

    @Test
    public void getQuestionThroughTheAnswerObjectHIBERNATE(){

        // check the MYSQL database for proper index
        int indexToDelete = 2;
        Session session = factory.getCurrentSession();
    connection = ConnectionFactory.getDatabaseConnection("MYSQL");

        try{
        session.beginTransaction();

        int indexOfAnswer = 1;
        AnswerEntity answerEntity = session.get(AnswerEntity.class, indexOfAnswer);
        System.out.println("\nAnswerEntity: " + answerEntity);

        System.out.println("The associated Question: " + answerEntity.getQuestionEntity() + "\n");

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

    @Test
    public void saveTestQuestionEntityAndTestAnswerEntity(){
        Session session = factory.getCurrentSession();
        connection = ConnectionFactory.getDatabaseConnection("MYSQL");

        try{
            session.beginTransaction();

            QuestionEntity question = new QuestionEntity("Is this a test question using HIBERNATE?");
            AnswerEntity answer = new AnswerEntity("Yes this is an test answer using hibernate and I'm attached to you.");

            // save both
            question.setAnswerEntity(answer);

            session.save(question);
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

    @Test
    public void saveTESTVersesEntityToDatabase(){
        // before running this test you need to make sure you run saveTestQuestionEntityAndTestAnswerEntity() if
        // there is nothing in the database.

        Session session = factory.getCurrentSession();
        connection = ConnectionFactory.getDatabaseConnection("MYSQL");

        try{
            session.beginTransaction();
            int theId = 1;

            AnswerEntity answerEntity = session.get(AnswerEntity.class, theId);

            // Create verses
            VersesEntity ver1 = new VersesEntity(1, "Verse 1");
            VersesEntity ver2 = new VersesEntity(2, "Verse 2");
            VersesEntity ver3 = new VersesEntity(3, "Verse 3");

            answerEntity.addVerse(ver1);
            answerEntity.addVerse(ver2);
            answerEntity.addVerse(ver3);

            session.save(ver1);
            session.save(ver2);
            session.save(ver3);
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

    @Test
    public void getAnswerEntityFromDatabasePrintoutTheTestVersesAssociatedLAZY_LOADING(){
        // before running this test you need to make sure you run saveTestQuestionEntityAndTestAnswerEntity() if
        // there is nothing in the database.

        Session session = factory.getCurrentSession();
        connection = ConnectionFactory.getDatabaseConnection("MYSQL");

        try{
            session.beginTransaction();
            int theId = 1;

            AnswerEntity answerEntity = session.get(AnswerEntity.class, theId);

            System.out.println("\n >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");
            System.out.println("AnswerEntity: "+ answerEntity);
            System.out.println("\n >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");

            System.out.println("VersesEntity: " + answerEntity.getVersesEntityList());
            System.out.println("\n >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");


            session.getTransaction().commit();
            session.close();

            System.out.println("Session is now closed.");

            // Since you called the get() before closing the session you can call it again from memory
            System.out.println("VersesEntity: " + answerEntity.getVersesEntityList());
            System.out.println("\n >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");

        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
        }

        Assertions.fail();
    }

    @Test
    public void getAnswerEntityAndVersesUsingSQLString_JOIN_FETCHNegatesLazyLoading(){
        Session session = factory.getCurrentSession();
        connection = ConnectionFactory.getDatabaseConnection("MYSQL");

        try{
            session.beginTransaction();
            int theId = 1;

            Query<AnswerEntity> query =
                    session.createQuery("select i from AnswerEntity i " +
                                    "JOIN FETCH i.versesEntityList " +
                                    "where i.id=:theAnswersId",
                        AnswerEntity.class);

            query.setParameter("theAnswersId", theId);

            // execute query
            AnswerEntity answerEntity = query.getSingleResult();

            System.out.println("\n >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");
            System.out.println("AnswerEntity: "+ answerEntity);
            System.out.println("\n >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");

            System.out.println("VersesEntity: " + answerEntity.getVersesEntityList());
            System.out.println("\n >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");


            session.getTransaction().commit();
            session.close();

            System.out.println("Session is now closed.");

            // Since you called the get() before closing the session you can call it again from memory
            System.out.println("VersesEntity: " + answerEntity.getVersesEntityList());
            System.out.println("\n >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");

        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
        }

        Assertions.fail();
    }

    @Test
    public void deleteOneOfTheTestVersesFromTheDataBase(){
        Session session = factory.getCurrentSession();
        connection = ConnectionFactory.getDatabaseConnection("MYSQL");

        try{
            session.beginTransaction();

            int theId = 1;
            VersesEntity versesEntity = session.get(VersesEntity.class, theId);
            System.out.println("\n >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");
            System.out.println("Deleting the VerseEntity: " + versesEntity);
            System.out.println("\n >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");

            // this does not cascade delete
            session.delete(versesEntity);
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

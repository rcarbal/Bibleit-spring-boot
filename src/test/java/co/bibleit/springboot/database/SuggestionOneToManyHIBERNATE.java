package co.bibleit.springboot.database;

import co.bibleit.springboot.configurations.BibleitConfig;
import co.bibleit.springboot.database.interfaces.DatabaseConnection;
import co.bibleit.springboot.database.mysql.entities.questions.AnswerEntity;
import co.bibleit.springboot.database.mysql.entities.questions.QuestionEntity;
import co.bibleit.springboot.database.mysql.entities.questions.VersesEntity;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
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
                .buildSessionFactory();

        context = new AnnotationConfigApplicationContext(BibleitConfig.class);
        System.out.println("\n*** Hibernate Database Connection successful.***\n");
    }



    @AfterEach
    public void closeSessionFactory(){
        factory.close();
        connection = null;

        System.out.println("\n***Hibernate connection disconnected.***\n");
    }
}

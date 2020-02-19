package co.bibleit.springboot.dao;

import co.bibleit.springboot.database.mysql.entities.bible.BibleSection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class BibleitDAOImpl implements BibleitDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<BibleSection> getBibleSections() {

        //get the current hibernate session
        Session session = sessionFactory.getCurrentSession();

        //create a query
        Query<BibleSection> theQuery = session.createQuery("from bible_section", BibleSection.class);

        //execute the query and get list
        List<BibleSection> bibleSections = theQuery.getResultList();

        //return the results
        return bibleSections;
    }
}

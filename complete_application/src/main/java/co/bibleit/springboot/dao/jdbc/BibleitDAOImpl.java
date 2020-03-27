package co.bibleit.springboot.dao.jdbc;

import co.bibleit.springboot.database.mysql.entities.bible.BibleSection;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class BibleitDAOImpl implements BibleitDAO {

    //    @Autowired
//    private SessionFactory sessionFactory;
//
    @Override
    @Transactional
    public List<BibleSection> getBibleSections() {
//
//        Session session = sessionFactory.getCurrentSession();
//
//        //create a query
//        Query<BibleSection> theQuery = session.createQuery("from bible_section", BibleSection.class);
//
//        //execute the query and get list
//        List<BibleSection> bibleSections = theQuery.getResultList();
//
//        //return the results
//        return bibleSections;
//    }

        return null;
    }
}

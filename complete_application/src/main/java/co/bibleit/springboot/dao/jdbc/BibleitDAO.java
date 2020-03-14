package co.bibleit.springboot.dao.jdbc;

import co.bibleit.springboot.database.mysql.entities.bible.BibleSection;

import java.util.List;

public interface BibleitDAO {

    public List<BibleSection> getBibleSections();
}

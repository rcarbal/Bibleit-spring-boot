package co.bibleit.springboot.database.interfaces;

import co.bibleit.springboot.database.mysql.entities.BibleSections;

import java.util.List;

public interface DatabaseConnection {

    public void connect();

    public void testConnection();

    public void testCreateRowInTable(Object object);

    BibleSections getFromIndexDatabase(Object factory, int index);

    List<BibleSections> queryListFromSQLString(Object factory, String className);

    void updateSingleBibleSectionWithSQLString(Object factory, String sqlQuery, int index);
}

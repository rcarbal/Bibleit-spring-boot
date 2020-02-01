package co.bibleit.springboot.database.interfaces;

import co.bibleit.springboot.database.mysql.entities.BibleSections;

public interface DatabaseConnection {

    public void connect();

    public void testConnection();

    public void testCreateRowInTable(Object object);

    BibleSections getFromIndexDatabase(Object object, int index);
}

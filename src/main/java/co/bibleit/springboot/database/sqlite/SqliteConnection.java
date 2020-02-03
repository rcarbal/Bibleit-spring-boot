package co.bibleit.springboot.database.sqlite;

import co.bibleit.springboot.database.interfaces.DatabaseConnection;
import co.bibleit.springboot.database.mysql.entities.BibleSections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class SqliteConnection  implements DatabaseConnection {
    @Override
    public void connect() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:bibleit.db");
        } catch (SQLException e) {
            System.out.println("Something went wrong connection to SQLite database. " + e.getMessage());
        }
    }

    @Override
    public void testConnection() {

    }

    @Override
    public void testCreateRowInTable(Object object) {

    }

    @Override
    public BibleSections getFromIndexDatabase(Object object, int index) {

        return null;
    }

    @Override
    public List<BibleSections> queryListFromSQLString(Object factory, String object) {
        return null;
    }

    @Override
    public void updateSingleBibleSectionWithSQLString(Object factory, String sqlQuery, int index) {

    }
}

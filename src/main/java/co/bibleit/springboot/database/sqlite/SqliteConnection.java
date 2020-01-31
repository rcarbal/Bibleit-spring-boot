package co.bibleit.springboot.database.sqlite;

import co.bibleit.springboot.database.sqlite.interfaces.DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqliteConnection  implements DatabaseConnection {
    @Override
    public void connect() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:bibleit.db");
        }catch(SQLException e){
            System.out.println("Something went wrong connection to SQLite database. " + e.getMessage());
        }
    }
}

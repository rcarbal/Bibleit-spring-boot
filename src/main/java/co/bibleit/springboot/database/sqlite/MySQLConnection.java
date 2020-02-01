package co.bibleit.springboot.database.sqlite;

import co.bibleit.springboot.database.sqlite.interfaces.DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection implements DatabaseConnection {
    @Override
    public void connect() {
        
    }

    @Override
    public void testConnection() {
        String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "2Qepxniw";

        try{
            System.out.println("Connection to database. " + jdbcUrl);
            Connection connection= DriverManager.getConnection(jdbcUrl, user, password);

            System.out.println("Connection successful!!!");
        }
        catch (SQLException e){
            System.out.println("Something went wrong connection to MySQL database. " + e.getMessage());
        }
    }
}

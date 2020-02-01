package co.bibleit.springboot;

import co.bibleit.springboot.database.mysql.MySQLConnection;
import co.bibleit.springboot.database.interfaces.DatabaseConnection;

public class Main {

    public static void main(String[] args) {
        DatabaseConnection connection = new MySQLConnection();
        connection.testConnection();
    }
}

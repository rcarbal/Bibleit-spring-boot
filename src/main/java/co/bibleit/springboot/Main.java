package co.bibleit.springboot;

import co.bibleit.springboot.database.sqlite.MySQLConnection;
import co.bibleit.springboot.database.sqlite.interfaces.DatabaseConnection;

public class Main {

    public static void main(String[] args) {
        DatabaseConnection connection = new MySQLConnection();
        connection.testConnection();
    }
}

package co.bibleit.springboot;

import co.bibleit.springboot.database.sqlite.SqliteConnection;

public class Main {

    public static void main(String[] args) {
        SqliteConnection connection = new SqliteConnection();
        connection.connect();
    }
}

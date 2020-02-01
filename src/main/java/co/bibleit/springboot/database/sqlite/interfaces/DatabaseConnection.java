package co.bibleit.springboot.database.sqlite.interfaces;

public interface DatabaseConnection {

    public void connect();

    public void testConnection();
}

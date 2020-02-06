package co.bibleit.springboot.database.concretecreator;

import co.bibleit.springboot.database.interfaces.DatabaseConnection;
import co.bibleit.springboot.database.mysql.MySQLConnection;
import co.bibleit.springboot.database.sqlite.SqliteConnection;

public class ConnectionFactory {

    public static DatabaseConnection getDatabaseConnection(String connectionType){
        if (connectionType == null) {
            return null;
        } else if (connectionType.equalsIgnoreCase("MYSQL")){
            return new MySQLConnection();
        } else if (connectionType.equalsIgnoreCase("SQLITE")){
            return new SqliteConnection();
        }
        return null;
    }
}

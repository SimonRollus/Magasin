package dataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class SingletonConnection {
    private static Connection uniqueConnection;

    private SingletonConnection(){}

    public Connection getInstance() throws SQLException{
        if (uniqueConnection == null)
                uniqueConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/magasin",
                        "root",
                        "tonmotdepasse");

            return uniqueConnection;
    }
}

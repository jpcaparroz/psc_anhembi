package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectBd {
    
    static String urlBD = "jdbc:mysql://localhost:3306/bd_java"; //url do banco de dados
    static String username = "root"; //login do banco de dados
    static String password = "2509"; //senha do banco de dados

    public static Connection getConnection() throws SQLException{
        Connection connection = null;

        connection = DriverManager.getConnection(urlBD, username, password);
        
        return connection;
    }
}

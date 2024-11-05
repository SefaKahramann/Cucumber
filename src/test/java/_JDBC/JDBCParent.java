package _JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCParent {
    private static Connection connection;
    public static Statement statement;

    public static void DbConnectionOpen() {
        String URL = "jdbc:mysql://demo.mersys.io:33906/sakila";
        String username = "student";
        String password = "DEkzTd3#pzPm";


        try {
            connection = DriverManager.getConnection(URL, username, password);
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void DbConnectionClose() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

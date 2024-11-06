package Utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtility {
    private static Connection connection;
    public static Statement statement;

    public static List<List<String>> getData(String select){
        DbConnectionOpen();
        List<List<String>> getData=new ArrayList<>();
        try {
            ResultSet resultSet = statement.executeQuery(select);

            ResultSetMetaData rsmd = resultSet.getMetaData();

            while (resultSet.next()) {
                List<String> row =new ArrayList<>();

                for (int j = 1; j <= rsmd.getColumnCount(); j++) {
                    row.add(resultSet.getString(j)+"\t "); //  satırları doldur
                }

                getData.add(row);// ana tabloya ekle
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        DbConnectionClose();
        return getData;
    }

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

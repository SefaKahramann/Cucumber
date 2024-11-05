package _JDBC;

import java.sql.*;

// city tablosundaki tüm satırlardaki şehir isimlerini next ile yazdırınız
public class _02_Soru {
    public static void main(String[] args) throws SQLException {
        String URL = "jdbc:mysql://demo.mersys.io:33906/sakila";
        String username = "student";
        String password = "DEkzTd3#pzPm";

        Connection connection = DriverManager.getConnection(URL, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from city");

        int i = 1;
        while (resultSet.next()){
            String city = resultSet.getNString("city");
            System.out.println(i+". satır = " +city);
            i++;
        }
        connection.close();
    }
}

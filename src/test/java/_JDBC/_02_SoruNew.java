package _JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_SoruNew extends JDBCParent{
    public static void main(String[] args) {
        DbConnectionOpen();

        try {
            ResultSet resultSet=statement.executeQuery("select * from city;");

            int i = 1;
            while (resultSet.next()){
                String city = resultSet.getNString("city");
                System.out.println(i+". satır = " +city);
                i++;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        DbConnectionClose();
    }
}

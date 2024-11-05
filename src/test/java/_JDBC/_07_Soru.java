package _JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _07_Soru extends JDBCParent {
    public static void main(String[] args) throws SQLException {
        //city tablosundaki tüm satırlardaki şehir isimlerini relative ile yazdırınız
        DbConnectionOpen();

        ResultSet rs = statement.executeQuery("select city from city");
        rs.last();
        int lastRow = rs.getRow();
        rs.first();
        System.out.println(0 + ". satırdaki şehir : " + rs.getString(1));
        for (int i = 1; i <lastRow; i++) {
            rs.relative(i-rs.getRow());
            //rs.relative(1);
            System.out.println(i + ". satırdaki şehir : " + rs.getString(1)); // "city" de verilebilir
        }

        DbConnectionClose();
    }
}

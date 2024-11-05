package _JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _06_Soru extends JDBCParent {
    public static void main(String[] args) throws SQLException {
        // city tablosundaki tüm satırlardaki şehir isimlerini absolute ile yazdırınız
        DbConnectionOpen();

        ResultSet rs = statement.executeQuery("select city from city");

        rs.last(); // son satıra gitti
        int lastRow = rs.getRow(); // son satırı aldım

        for (int i = 1; i <= lastRow; i++) {
            rs.absolute(i);
            System.out.println(i + ". satırdaki şehir : " + rs.getString(1)); // "city" de verilebilir
        }

        DbConnectionClose();
    }
}

package _JDBC;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _10_Soru extends JDBCParent {
    public static void main(String[] args) throws SQLException {
        // language tablosundaki tüm satırları ve tüm sütunları yazdırınız,
        // aynı mysql sonuç ekranında olduğu gibi
        DbConnectionOpen();

        ResultSet rs = statement.executeQuery("select * from language;");
        ResultSetMetaData rsmd = rs.getMetaData();

        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            System.out.print(rsmd.getColumnName(i) + "\t");
        }
        System.out.println(); // başlıklardan sonra 1 satır atla

        while (rs.next()) {
            for (int j = 1; j <= rsmd.getColumnCount(); j++) { // bu bölüm her satırdaki kolonları yazdırır
                System.out.print(rs.getString(j) + " ");
            }
            System.out.println();
        }

        DbConnectionClose();
    }
}

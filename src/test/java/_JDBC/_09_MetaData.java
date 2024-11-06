package _JDBC;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _09_MetaData extends JDBCParent{
    public static void main(String[] args) throws SQLException {
        DbConnectionOpen();

        ResultSet rs=statement.executeQuery("select * from city;");
      // sorgu sonucunda DATA dışındaki veriler ,  kolon sayısı ve kolon isimleri
        ResultSetMetaData rsmd= rs.getMetaData();

        int columnCount= rsmd.getColumnCount();
        System.out.println("columnCount = " + columnCount);

        for (int i = 1; i <= columnCount; i++) {
            System.out.println("Kolun ismi : "+rsmd.getColumnName(i)+" kolonun tipi : "+rsmd.getColumnTypeName(i));
        }

        rs.next();
        for (int i = 1; i <= columnCount; i++) {
            System.out.println( i+". kolon : "+rs.getString(i));
        }

        DbConnectionClose();
    }
}

package _JDBC;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class _11_Soru extends JDBCParent{
// kendisine gönderilen bir select sonucu list olarak döndüren
    // methodu yazınız
    public static void main(String[] args) throws SQLException {
        DbConnectionOpen();

        List<List<String>> data=getData("select * from language;");

        for (List<String> row : data){
            System.out.println(row);
        }

        DbConnectionClose();
    }
    public static List<List<String>> getData(String select){
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
        return getData;
    }
}

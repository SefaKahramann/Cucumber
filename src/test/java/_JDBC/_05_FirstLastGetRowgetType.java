package _JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _05_FirstLastGetRowgetType  extends  JDBCParent{
    public static void main(String[] args) throws SQLException {
        DbConnectionOpen();

        ResultSet rs= statement.executeQuery("select city from city");
        rs.last(); // bu kod beni son satıra götürüyor
        System.out.println("Son Satır : "+ rs.getString(1)); // Ziguinchor
        System.out.println("Kaçıncı satırdayım : "+rs.getRow()); // bu kaçıncı satırdayım

        rs.first(); // ilk satır
        System.out.println("ilk Satır : "+ rs.getString(1)); // A Coruña (La Coruña)
        System.out.println("Kaçıncı satırdayım : "+rs.getRow()); // bu kaçıncı satırdayım

        DbConnectionClose();
    }
    //resultSet.next(); sonraki satır
    //resultSet.previous(); önceki satır
    // rs.last(); son satır
    // rs.first(); ilk satır
}

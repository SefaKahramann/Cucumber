package _JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _05_FirstLastGetRowgetType extends JDBCParent {
    public static void main(String[] args) throws SQLException {
        DbConnectionOpen();

        ResultSet rs = statement.executeQuery("select city from city");
        rs.last(); // bu kod beni son satıra götürüyor
        System.out.println("Son Satır : " + rs.getString(1)); // Ziguinchor
        System.out.println("Kaçıncı satırdayım : " + rs.getRow()); // bu kaçıncı satırdayım

        rs.first(); // ilk satır
        System.out.println("ilk Satır : " + rs.getString(1)); // A Coruña (La Coruña)
        System.out.println("Kaçıncı satırdayım : " + rs.getRow()); // bu kaçıncı satırdayım

        DbConnectionClose();
    }
// rs.next() : sonraki satır
// rs.previous : önceki satır
// rs.absolute(10) : baştan itibaren 10.satıra ileri gider.
// rs.relative(10) : bulunduğu yerden 10.satıra ileri gider.
// rs.absolute(-10) : - (eksi) sondan demektir, sondan 10.satır
// rs.relative(-5) :  - (eksi) bulunduğu yerden 5 satır geri
// ilk satırdan relative ile 5 geri gitmek istersek sınırı taştığı için hata verecektir
}

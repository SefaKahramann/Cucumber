package _JDBC;

import java.sql.*;

public class _01_Giris {
    public static void main(String[] args) throws SQLException {
        String URL = "jdbc:mysql://demo.mersys.io:33906/sakila";
        String username = "student";
        String password = "DEkzTd3#pzPm";

        //1- bağlantı bilgilerini girdik DB servere bağlandık
        Connection baglanti = DriverManager.getConnection(URL, username, password);

        // 2- Sorgu ekranını açtık
        Statement sorguEkrani = baglanti.createStatement();

        // 3- Sorgu ekranına sorguyu yazdım ve çalıştırdım
        ResultSet sonucTablo = sorguEkrani.executeQuery("select * from customer");

        //4- Altta sonuçlar gözüküyordu programda, burada next ile her bir satıra ulaşıp alıyorum
        sonucTablo.next();

        String ad = sonucTablo.getNString("first_name");
        String soyAd = sonucTablo.getNString("last_name");

        System.out.println("1. satır Ad ve Soyad = " + ad + " " + soyAd);

        sonucTablo.next();

        ad = sonucTablo.getNString("first_name");
        soyAd = sonucTablo.getNString("last_name");

        System.out.println("2. satır Ad ve Soyad = " + ad + " " + soyAd);
    }
}

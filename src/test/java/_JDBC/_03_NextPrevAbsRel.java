package _JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_NextPrevAbsRel extends  JDBCParent{
    public static void main(String[] args) throws SQLException {
        DbConnectionOpen();

        ResultSet resultSet = statement.executeQuery("select * from language");
        resultSet.next(); // 1 adım ileri,sıradakine git demek
        System.out.println("1. satır "+resultSet.getString(2)); // 2 index değil kolon sırası : English

        resultSet.next();
        System.out.println("2. satır "+resultSet.getString(2)); // Italian (2 : name ile aynı manaya geliyor)

        resultSet.previous(); // 1 adım geri git demek
        System.out.println("1. satır : "+resultSet.getString(2)); // English

        DbConnectionClose();
    }
}

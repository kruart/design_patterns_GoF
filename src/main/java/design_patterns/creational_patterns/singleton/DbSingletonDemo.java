package design_patterns.creational_patterns.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {

    public static void main(String[] args) {
        long timeBefore = 0;
        long timeAfter = 0;

        DbSingleton instance = DbSingleton.getInstance();

        timeBefore = System.currentTimeMillis();
        Connection conn = instance.getConnection();
        timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter - timeBefore);

        Statement statement;
        try {
            statement = conn.createStatement();
            int count = statement
                    .executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20), City VARCHAR(20))");
            System.out.println("Table created");
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //our singleton in action
        timeBefore = System.currentTimeMillis();
        conn = instance.getConnection();
        timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter - timeBefore);
    }
}

package design_patterns.structural_patterns.facade.example_without_facade;

import design_patterns.creational_patterns.singleton.DbSingleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();

        try {
            Connection conn = instance.getConnection();
            Statement statement = conn.createStatement();

            int count = statement.executeUpdate("CREATE TABLE Address (ID INTEGER, StreetName VARCHAR(20), City VARCHAR(20))");

            System.out.println("Table created");
            statement.close();

            statement = conn.createStatement();
            count = statement.executeUpdate("INSERT INTO Address (ID, StreetName, City) VALUES (1, '1234 Some Street', 'Layton')");

            System.out.println(count + " record(s) created.");
            statement.close();

            statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Address");

            while (rs.next()) {
                System.out.print(rs.getString(1) + " ");
                System.out.print(rs.getString(2) + " ");
                System.out.println(rs.getString(3) + " ");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

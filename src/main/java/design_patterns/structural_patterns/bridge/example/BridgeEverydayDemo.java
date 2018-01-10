package design_patterns.structural_patterns.bridge.example;

import org.apache.derby.jdbc.EmbeddedDriver;

import java.sql.*;

public class BridgeEverydayDemo {

    public static void main(String[] args) {
        try {
            //JDBC is an API
            DriverManager.registerDriver(new EmbeddedDriver()); //<-Driver

            String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
            Connection conn = DriverManager.getConnection(dbUrl);
            Statement statement = conn.createStatement();

            //This client is an abstraction and can work with any database that has a driver
            statement.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20), City VARCHAR(20))");

            System.out.println("Table created");

            statement.executeUpdate("INSERT INTO Address(ID, StreetName, City) VALUES(1, 'Avenue', 'Kyiv')");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Address");

            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("ID"));
                System.out.println("StreetName: " + resultSet.getString("StreetName"));
                System.out.println("City: " + resultSet.getString("City"));
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

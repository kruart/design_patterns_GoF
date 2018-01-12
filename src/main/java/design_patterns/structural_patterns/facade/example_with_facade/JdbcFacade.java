package design_patterns.structural_patterns.facade.example_with_facade;

import design_patterns.structural_patterns.facade.DbSingleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {

    private DbSingleton instance = null;

    public JdbcFacade() {
        instance = DbSingleton.getInstance();
    }

    public int createTable() {
        int count = 0;

        try {
            Connection conn = instance.getConnection();
            Statement statement = conn.createStatement();

            count = statement.executeUpdate("CREATE TABLE Address (ID INTEGER, StreetName VARCHAR(20), City VARCHAR(20))");

            statement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return count;
    }

    public int insertIntoTable() {
        int count = 0;

        try {
            Connection conn = instance.getConnection();
            Statement statement = conn.createStatement();

            count = statement.executeUpdate("INSERT INTO Address (ID, StreetName, City) VALUES (1, '1234 Some Street', 'Layton')");

            statement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return count;

    }

    public List<Address> getAddresses() {
        List<Address> addressList = new ArrayList<>();

        try {
            Connection conn = instance.getConnection();
            Statement statement = conn.createStatement();

            ResultSet rs = statement.executeQuery("SELECT * FROM Address");

            while (rs.next()) {
                addressList.add(new Address(rs.getString("ID"), rs.getString("StreetName"), rs.getString("City")));
            }

            statement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return addressList;

    }
}

class Address {
    private String id;
    private String streetName;
    private String city;

    public Address(String id, String streetName, String city) {
        this.id = id;
        this.streetName = streetName;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id='" + id + '\'' +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

package design_patterns.structural_patterns.facade.example_with_facade;

import java.util.List;

public class JdbcDemo2 {

    public static void main(String[] args) {
        JdbcFacade jdbcFacade = new JdbcFacade();
        jdbcFacade.createTable();
        jdbcFacade.insertIntoTable();
        List<Address> addresses = jdbcFacade.getAddresses();

        addresses.forEach(System.out::println);
    }
}

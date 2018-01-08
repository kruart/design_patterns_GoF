package design_patterns.creational_patterns.prototype;

import java.util.ArrayList;

//it's shallow copy, it's not really copy
public class PrototypeEverydayDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        String sql = "select * from movies where title = ?";

        ArrayList<String> parameters = new ArrayList<>();
        parameters.add("Star wars");

        Record record = new Record();
        Statement firstStatement = new Statement(sql, parameters, record);

        System.out.println(firstStatement.getSql());
        System.out.println(firstStatement.getParameters());
        System.out.println(firstStatement.getRecord());

        Statement secondStatement = firstStatement.clone();

        System.out.println(secondStatement.getSql());
        System.out.println(secondStatement.getParameters());
        System.out.println(secondStatement.getRecord());

        secondStatement.getParameters().set(0, "Star Wines");   //changes in list reflect in both objects ... it's bad
        System.out.println(firstStatement.getParameters());
        System.out.println(secondStatement.getParameters());
    }
}

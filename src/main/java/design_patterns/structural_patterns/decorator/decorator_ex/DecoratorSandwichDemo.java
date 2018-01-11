package design_patterns.structural_patterns.decorator.decorator_ex;

public class DecoratorSandwichDemo {

    public static void main(String[] args) {
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

        System.out.println(sandwich.make());
    }
}

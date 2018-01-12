package design_patterns.structural_patterns.flyweight.flyweight_example;

//Instances of Item will be the Flyweights
public class Item {
    private final String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

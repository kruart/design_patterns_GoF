package design_patterns.structural_patterns.flyweight.flyweight_example;

public class Order {
    private final int orderName;
    private final Item item;

    public Order(int orderName, Item item) {
        this.orderName = orderName;
        this.item = item;
    }

    void processOrder() {
        System.out.println("Ordering " + item + " for order number " + orderName);
    }
}

package design_patterns.structural_patterns.flyweight.flyweight_example;

public class FlyweightInventoryDemo {
    public static void main(String[] args) {
        InventorySystem ims = new InventorySystem();

        ims.takeOrder("Roomba", 221);
        ims.takeOrder("Bose Headphones", 361);
        ims.takeOrder("Samsung Tv", 432);
        ims.takeOrder("Samsung Tv", 323);
        ims.takeOrder("Roomba", 563);
        ims.takeOrder("Bose Headphones", 321);
        ims.takeOrder("Roomba", 234);
        ims.takeOrder("Samsung Tv", 54);
        ims.takeOrder("Roomba", 34);
        ims.takeOrder("Bose Headphones", 365);
        ims.takeOrder("Samsung Tv", 332);
        ims.takeOrder("Roomba", 456);

        ims.process();

        System.out.println(ims.report());
    }
}

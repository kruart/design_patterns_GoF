package design_patterns.creational_patterns.builder;

public class BuilderLunchOrderDemo {
    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();


        LunchOrder lunchOrder = builder.addBread("Wheat")
                .addCondiments("Lettuce")
                .addDressing("Mayo")
                .addMeat("Turkey")
                .build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());



    }
}

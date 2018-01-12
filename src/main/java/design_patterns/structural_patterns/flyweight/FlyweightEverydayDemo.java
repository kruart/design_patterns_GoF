package design_patterns.structural_patterns.flyweight;

public class FlyweightEverydayDemo {

    public static void main(String[] args) {
        //valueOf will always cache values in the range -128 to 127
        Integer firstInt = Integer.valueOf(127);
        Integer secondInt = Integer.valueOf(127);

        Integer thirdInt = Integer.valueOf(128);
        Integer fourthInt = Integer.valueOf(128);

        System.out.println(System.identityHashCode(firstInt));
        System.out.println(System.identityHashCode(secondInt));
        System.out.println(System.identityHashCode(thirdInt));
        System.out.println(System.identityHashCode(fourthInt));
    }
}

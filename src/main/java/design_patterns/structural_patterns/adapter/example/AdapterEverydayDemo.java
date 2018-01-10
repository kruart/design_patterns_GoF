package design_patterns.structural_patterns.adapter.example;

import java.util.Arrays;
import java.util.List;

public class AdapterEverydayDemo {

    public static void main(String[] args) {
        Integer[] arrayOfInts = {42, 43, 44};

        List<Integer> integerList = Arrays.asList(arrayOfInts); //adapting array to list

        System.out.println(Arrays.toString(arrayOfInts));
        System.out.println(integerList);

    }
}

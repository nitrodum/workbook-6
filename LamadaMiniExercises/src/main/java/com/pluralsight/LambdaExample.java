package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExample{

    public static void main(String[] args) {
        NumericOperator adder = (x , y) -> x + y;
        System.out.println(adder.operate(12,15));

        NumericOperator findMax = (x, y) -> Math.max(x, y);
        System.out.println(findMax.operate(1, 10));

        StringFormatter toUpper = (s) -> s.toUpperCase();
        System.out.println(toUpper.format("helloWorld"));

        UnaryOperator square = (x) -> (int)Math.sqrt(x);
        System.out.println(square.apply(16));

        TriFunction average = (x, y, z) -> (x + y + z)/3;
        System.out.println(average.apply(1,2,3));

        Printer p = (s) -> System.out.println(s);
        p.print("Hello World!");

        Predicate<String> predicate = (s) -> !s.isEmpty();
        System.out.println(predicate.test(""));

        List<String> strings = List.of("Hello", "", "World!");
        processStrings(predicate, strings);

        Consumer<Integer> consumer = (x) -> System.out.println(x);
        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        intList.forEach(consumer);
        intList.forEach(System.out::println);
    }

    public static void processStrings(Predicate<String> predicate, List<String> strings) {
        for (String s : strings) {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        }
    }
}

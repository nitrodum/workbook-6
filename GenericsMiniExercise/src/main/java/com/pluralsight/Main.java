package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String t = "Hello ";
        String u = "World!";

        Tester<String, String> tester = new Tester<>(t, u);
        tester.printT();
        tester.printU();

        ArrayList<Number> numberArrayList = new ArrayList<>();
        numberArrayList.add(1);
        numberArrayList.add(2.5);
        numberArrayList.add(3);
        printAverage(numberArrayList);
    }

    public static void printAverage(ArrayList<Number> numberArrayList) {
        double sum = 0;
        for (Number n : numberArrayList) {
            sum += n.doubleValue();
        }
        System.out.println(sum/numberArrayList.size());
    }
}
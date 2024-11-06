package com.pluralsight;

import java.util.List;

public class TerminalOperationsExample {
    public static void main(String[] args) {
        List<Integer> intList = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(intList.stream().filter(x -> x%2 == 0).count());
    }
}

package com.pluralsight;

import java.util.List;

public class LoopToForEachExample {
    public static void main(String[] args) {
        List<String> stringList = List.of("a", "b", "c", "Hello", "World", "!");
        stringList.forEach(System.out::println);
    }
}

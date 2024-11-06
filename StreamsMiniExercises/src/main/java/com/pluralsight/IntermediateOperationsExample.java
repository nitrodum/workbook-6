package com.pluralsight;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperationsExample {
    public static void main(String[] args) {
        List<String> stringList = List.of("Hello", "World!");
        List<String> filtered = stringList.stream().filter(s -> s.length() < 6).map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(filtered);
    }
}

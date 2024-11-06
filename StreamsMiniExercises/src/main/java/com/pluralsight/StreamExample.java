package com.pluralsight;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> intList = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> filtered = intList.stream()
                .filter(x -> x%2 == 0)
                .map(x -> (int)Math.pow(x, 2))
                .collect(Collectors.toList());
        System.out.println(filtered);

    }
}

package com.pluralsight;

import java.util.ArrayList;

public class Box<T> {
    private ArrayList<T> tArrayList;
    public Box() {
    }

    public void add(T t) {
        tArrayList.add(t);
    }

    public void print() {
        for (T t : tArrayList) {
            System.out.println(t);
        }
    }
}

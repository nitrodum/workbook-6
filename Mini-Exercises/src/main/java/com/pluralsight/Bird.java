package com.pluralsight;

public class Bird extends Animal implements Flyable {
    public void fly() {
        System.out.println("Bird is flying!");
    }
}

package com.pluralsight;

public class Assistant extends PartTimeEmployee implements Promotable {

    public Assistant(double salary) {
        super(salary);
    }

    public void promote() {
        System.out.println("Assistant is now promoted!");
    }
}

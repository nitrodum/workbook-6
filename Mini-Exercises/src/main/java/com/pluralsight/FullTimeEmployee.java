package com.pluralsight;

public class FullTimeEmployee extends Employee implements Promotable {


    protected FullTimeEmployee(double salary) {
        super(salary);
    }

    public void promote() {
        System.out.println("Employee is now promoted!");
    }

}

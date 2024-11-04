package com.pluralsight;

public class Employee {
    private double salary;

    protected Employee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

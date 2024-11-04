package com.pluralsight;

public class Laptop extends PortableDevice implements Chargeable {
    public void charge() {
        System.out.println("Laptop is now charging.");
    }

}

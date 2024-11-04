package com.pluralsight.finance;

import java.util.ArrayList;

public class Portfolio {
    private String name;
    private String owner;
    private ArrayList<Valuable> assets = new ArrayList<Valuable>();

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public void add(Valuable valuable) {
        this.assets.add(valuable);
    }

    public double getValue() {
        double value = 0;
        for (Valuable v : this.assets) {
            value += v.getValue();
        }
        return value;
    }
}

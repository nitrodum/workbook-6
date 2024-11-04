package com.pluralsight.finance;

public class Gold extends FixedAsset {
    private double weight;

    public Gold(double weight) {
        super("Gold", weight*200);
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return getMarketValue();
    }

    public double getWeight() {
        return weight;
    }
}

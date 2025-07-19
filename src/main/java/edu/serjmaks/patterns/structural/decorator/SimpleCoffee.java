package edu.serjmaks.patterns.structural.decorator;

public class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "simple coffee";
    }

    @Override
    public double getCost() {
        return 5;
    }
}

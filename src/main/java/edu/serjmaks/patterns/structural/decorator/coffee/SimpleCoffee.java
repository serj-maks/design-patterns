package edu.serjmaks.patterns.structural.decorator.coffee;

import edu.serjmaks.patterns.structural.decorator.Coffee;

public class SimpleCoffee implements Coffee {
    @Override
    public Integer getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Simple coffee";
    }
}

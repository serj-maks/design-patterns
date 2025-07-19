package edu.serjmaks.patterns.structural.decorator.decoratorImpl;

import edu.serjmaks.patterns.structural.decorator.Coffee;
import edu.serjmaks.patterns.structural.decorator.CoffeeDecorator;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", milk";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }
}

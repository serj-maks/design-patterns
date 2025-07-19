package edu.serjmaks.patterns.structural.decorator;

import edu.serjmaks.patterns.structural.decorator.decoratorImpl.MilkDecorator;
import edu.serjmaks.patterns.structural.decorator.decoratorImpl.SugarDecorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());
    }
}

package edu.serjmaks.patterns.structural.decorator;

import edu.serjmaks.patterns.structural.decorator.coffee.ChocolateCoffee;
import edu.serjmaks.patterns.structural.decorator.coffee.MilkCoffee;
import edu.serjmaks.patterns.structural.decorator.coffee.SimpleCoffee;

public class Demo {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.getDescription());
        System.out.println(simpleCoffee.getCost());

        Coffee milkCoffee = new MilkCoffee(simpleCoffee);
        System.out.println(milkCoffee.getDescription());
        System.out.println(milkCoffee.getCost());

        Coffee chocolateCoffee = new ChocolateCoffee(milkCoffee);
        System.out.println(chocolateCoffee.getDescription());
        System.out.println(chocolateCoffee.getCost());
    }
}

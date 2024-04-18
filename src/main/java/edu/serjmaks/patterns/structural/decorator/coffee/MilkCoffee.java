package edu.serjmaks.patterns.structural.decorator.coffee;

import edu.serjmaks.patterns.structural.decorator.Coffee;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MilkCoffee implements Coffee {

    private final Coffee decorated;

    @Override
    public Integer getCost() {
        return decorated.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return decorated.getDescription() + ", milk";
    }
}

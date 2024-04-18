package edu.serjmaks.patterns.structural.adapter.wilddog;

public class AfricanWildDog implements WildDog {
    @Override
    public void bark() {
        System.out.println("woof-woof");
    }
}

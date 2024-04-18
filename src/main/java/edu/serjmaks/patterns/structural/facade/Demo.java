package edu.serjmaks.patterns.structural.facade;

public class Demo {
    public static void main(String[] args) {
        ComputerFacade facade = new ComputerFacade();
        facade.turnOn();
    }
}

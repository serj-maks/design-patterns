package edu.serjmaks.patterns.behavioral.command;

// receiver
// получатель, содержащий реализации каждого действия, которое может быть выполнено
public class Bulb {

    public void turnOn() {
        System.out.println("Lighting!");
    }

    public void turnOff() {
        System.out.println("Darkness!");
    }
}

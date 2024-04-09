package edu.serjmaks.patterns.creational.factory;

public class Demo {
    public static void main(String[] args) {
        Door woodenDoor = DoorFactory.makeWoodenDoor(100, 200);
        System.out.println(woodenDoor.getWidth());
        System.out.println(woodenDoor.getHeight());
    }
}

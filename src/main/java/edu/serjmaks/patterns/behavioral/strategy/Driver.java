package edu.serjmaks.patterns.behavioral.strategy;

public class Driver {
    private String name;
    private DrivingStyle strategy;

    public Driver(DrivingStyle strategy) {
        this.strategy = strategy;
    }

    public void drive() {
        strategy.driveStyle();
    }

    public void setDrivingStyle(DrivingStyle strategy) {
        this.strategy = strategy;
    }
}

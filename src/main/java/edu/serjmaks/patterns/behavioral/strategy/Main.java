package edu.serjmaks.patterns.behavioral.strategy;

import edu.serjmaks.patterns.behavioral.strategy.strategy.EcoDriving;
import edu.serjmaks.patterns.behavioral.strategy.strategy.FastDriving;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver(new EcoDriving());
        driver.drive();

        driver.setDrivingStyle(new FastDriving());
        driver.drive();
    }
}

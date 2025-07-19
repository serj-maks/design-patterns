package edu.serjmaks.patterns.behavioral.strategy.strategy;

import edu.serjmaks.patterns.behavioral.strategy.DrivingStyle;

public class FastDriving implements DrivingStyle {

    @Override
    public void driveStyle() {
        System.out.println("fast driving");
    }
}

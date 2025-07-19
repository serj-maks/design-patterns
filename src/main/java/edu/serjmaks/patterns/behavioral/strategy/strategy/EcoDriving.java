package edu.serjmaks.patterns.behavioral.strategy.strategy;

import edu.serjmaks.patterns.behavioral.strategy.DrivingStyle;

public class EcoDriving implements DrivingStyle {

    @Override
    public void driveStyle() {
        System.out.println("eco driving");
    }
}

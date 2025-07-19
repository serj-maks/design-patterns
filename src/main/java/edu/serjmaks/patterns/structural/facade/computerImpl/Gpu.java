package edu.serjmaks.patterns.structural.facade.computerImpl;

import edu.serjmaks.patterns.structural.facade.Computer;

public class Gpu extends Computer {

    @Override
    public void start() {
        System.out.println("set kitty.jpg to screen");
    }
}

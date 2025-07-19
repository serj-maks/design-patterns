package edu.serjmaks.patterns.structural.facade.computerImpl;

import edu.serjmaks.patterns.structural.facade.Computer;

public class Keyboard extends Computer {

    @Override
    public void start() {
        System.out.println("tak-tak-tak");
    }
}

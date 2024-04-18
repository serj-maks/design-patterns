package edu.serjmaks.patterns.structural.facade.computer;

import edu.serjmaks.patterns.structural.facade.Computer;

public class Cpu extends Computer {

    @Override
    public void start() {
        System.out.println("1 + 2 + 3 + ...");
    }
}

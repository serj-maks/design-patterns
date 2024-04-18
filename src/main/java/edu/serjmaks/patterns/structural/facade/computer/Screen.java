package edu.serjmaks.patterns.structural.facade.computer;

import edu.serjmaks.patterns.structural.facade.Computer;

public class Screen extends Computer {

    @Override
    public void start() {
        System.out.println("showing loading screen ...");
    }
}

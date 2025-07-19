package edu.serjmaks.patterns.structural.facade.computerImpl;

import edu.serjmaks.patterns.structural.facade.Computer;

public class Ram extends Computer {

    @Override
    public void start() {
        System.out.println("loading OS to ram memory...");
    }
}

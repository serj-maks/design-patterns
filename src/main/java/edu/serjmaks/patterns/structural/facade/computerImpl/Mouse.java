package edu.serjmaks.patterns.structural.facade.computerImpl;

import edu.serjmaks.patterns.structural.facade.Computer;

public class Mouse extends Computer {

    @Override
    public void start() {
        System.out.println("click-clack");
    }
}

package edu.serjmaks.patterns.structural.facade.computer;

import edu.serjmaks.patterns.structural.facade.Computer;

public class PowerAdapter extends Computer {

    @Override
    public void start() {
        System.out.println("zZzz-zz-zz");
    }
}

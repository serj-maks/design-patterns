package edu.serjmaks.patterns.structural.proxy;

public class ExpensiveObjectImpl implements ExpensiveObject {

    ExpensiveObjectImpl() {
        heavyInitialConfiguration();
    }

    @Override
    public void process() {
        System.out.println("processing complete");
    }

    private void heavyInitialConfiguration() {
        System.out.println("loading heavy configuration...");
    }
}

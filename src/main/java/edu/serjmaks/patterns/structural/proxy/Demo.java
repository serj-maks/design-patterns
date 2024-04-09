package edu.serjmaks.patterns.structural.proxy;

public class Demo {
    public static void main(String[] args) {
        ExpensiveObject expensiveObject = new ExpensiveObjectImpl();
        // we’re calling the process() method twice. Behind the scenes,
        // the settings part will occur only once – when the object is first initialized. For every other subsequent call,
        // this pattern will skip the initial configuration
        expensiveObject.process();
        expensiveObject.process();
    }
}

package edu.serjmaks.patterns.behavioral.state;

import edu.serjmaks.patterns.behavioral.state.model.Mammoth;

public class Demo {
    public static void main(String[] args) {
        Mammoth mammoth = new Mammoth();
        mammoth.observe();
        mammoth.timePasses();
        mammoth.observe();
        mammoth.timePasses();
        mammoth.observe();
    }
}

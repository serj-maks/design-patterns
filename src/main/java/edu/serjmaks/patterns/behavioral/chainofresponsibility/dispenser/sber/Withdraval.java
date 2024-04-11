package edu.serjmaks.patterns.behavioral.chainofresponsibility.dispenser.sber;

import edu.serjmaks.patterns.behavioral.chainofresponsibility.money.Currency;

public class Withdraval {

    private static AtmSber dispenser10 = new Dispenser10();
    private static AtmSber dispenser20 = new Dispenser20();
    private static AtmSber dispenser50 = new Dispenser50();
    private static AtmSber dispenser100 = new Dispenser100();
    private static AtmSber dispenserChain;

    static {
       setTheChainOfResponsibility();
    }

    public static void setTheChainOfResponsibility() {
        dispenser100.setNextDispenser(dispenser50);
        dispenser50.setNextDispenser(dispenser20);
        dispenser20.setNextDispenser(dispenser10);
        dispenserChain = dispenser100;
    }

    public static void withdraw(Currency currency) {
        if (currency != null) {
            dispenserChain.dispense(currency);
        }
    }
}

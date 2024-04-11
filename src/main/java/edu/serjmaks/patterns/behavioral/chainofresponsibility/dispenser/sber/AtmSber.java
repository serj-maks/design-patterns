package edu.serjmaks.patterns.behavioral.chainofresponsibility.dispenser.sber;

import edu.serjmaks.patterns.behavioral.chainofresponsibility.dispenser.Atm;

public abstract class AtmSber implements Atm {

    protected AtmSber atmSber;

    public void setNextDispenser(AtmSber nextDispenser) {
        this.atmSber = nextDispenser;
    }
}

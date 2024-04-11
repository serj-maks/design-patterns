package edu.serjmaks.patterns.behavioral.chainofresponsibility.dispenser;

import edu.serjmaks.patterns.behavioral.chainofresponsibility.money.Currency;

public interface Atm {

    void dispense(Currency currency);
}

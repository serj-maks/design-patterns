package edu.serjmaks.patterns.behavioral.chainofresponsibility.dispenser.sber;

import edu.serjmaks.patterns.behavioral.chainofresponsibility.money.Currency;
import edu.serjmaks.patterns.behavioral.chainofresponsibility.money.Dollar;

public class Dispenser10 extends AtmSber {

    public Dispenser10() {
        super();
    }

    @Override
    public void dispense(Currency currency) {
        if (currency != null) {
            int amount = currency.getAmount();
            int remainder = amount;
            if (amount >= 10) {
                int count = amount / 10;
                remainder = amount % 10;
                System.out.printf("Dispensing '%d' 10$ currency note.\n", count);
            }
            if (remainder > 0 && this.atmSber != null) {
                this.atmSber.dispense(new Dollar(remainder));
            }
        }
    }
}

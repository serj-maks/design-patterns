package edu.serjmaks.patterns.behavioral.chainofresponsibility.dispenser.sber;

import edu.serjmaks.patterns.behavioral.chainofresponsibility.money.Currency;
import edu.serjmaks.patterns.behavioral.chainofresponsibility.money.Dollar;

public class Dispenser50 extends AtmSber {

    public Dispenser50() {
        super();
    }

    @Override
    public void dispense(Currency currency) {
        if (currency != null) {
            int amount = currency.getAmount();
            int remainder = amount;
            if (amount >= 50) {
                int count = amount / 50;
                remainder = amount % 50;
                System.out.printf("Dispensing '%d' 50$ currency note.\n", count);
            }
            if (remainder > 0 && this.atmSber != null) {
                this.atmSber.dispense(new Dollar(remainder));
            }
        }
    }
}

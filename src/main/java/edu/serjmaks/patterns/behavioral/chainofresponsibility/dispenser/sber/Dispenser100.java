package edu.serjmaks.patterns.behavioral.chainofresponsibility.dispenser.sber;

import edu.serjmaks.patterns.behavioral.chainofresponsibility.money.Currency;
import edu.serjmaks.patterns.behavioral.chainofresponsibility.money.Dollar;

public class Dispenser100 extends AtmSber {

    public Dispenser100() {
        super();
    }

    @Override
    public void dispense(Currency currency) {
        if (currency != null) {
            int amount = currency.getAmount();
            int remainder = amount;
            if (amount >= 100) {
                int count = amount / 100;
                remainder = amount % 100;
                System.out.printf("Dispensing '%d' 100$ currency note.\n", count);
            }
            if (remainder > 0 && this.atmSber != null) {
                this.atmSber.dispense(new Dollar(remainder));
            }
        }
    }
}

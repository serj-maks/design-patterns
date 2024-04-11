package edu.serjmaks.patterns.behavioral.chainofresponsibility.dispenser.sber;

import edu.serjmaks.patterns.behavioral.chainofresponsibility.money.Currency;
import edu.serjmaks.patterns.behavioral.chainofresponsibility.money.Dollar;

public class Dispenser20 extends AtmSber {

    public Dispenser20() {
        super();
    }

    @Override
    public void dispense(Currency currency) {
        if (currency != null) {
            int amount = currency.getAmount();
            int remainder = amount;
            if (amount >= 20) {
                int count = amount / 20;
                remainder = amount % 20;
                System.out.printf("Dispensing '%d' 20$ currency note.\n", count);
            }
            if (remainder > 0 && this.atmSber != null) {
                this.atmSber.dispense(new Dollar(remainder));
            }
        }
    }
}

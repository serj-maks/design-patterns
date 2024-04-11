package edu.serjmaks.patterns.behavioral.chainofresponsibility.money;

import edu.serjmaks.patterns.behavioral.chainofresponsibility.money.Currency;

public class Dollar implements Currency {

    private int amount;

    public Dollar(int amount) {
        super();
        this.amount = amount;
    }

    @Override
    public int getAmount() {
        return amount;
    }
}

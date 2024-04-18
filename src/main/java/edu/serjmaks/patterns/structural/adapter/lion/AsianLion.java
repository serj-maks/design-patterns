package edu.serjmaks.patterns.structural.adapter.lion;

public class AsianLion implements Lion {
    @Override
    public void roar() {
        System.out.println("Rrr! (bit with asian accent)");
    }
}

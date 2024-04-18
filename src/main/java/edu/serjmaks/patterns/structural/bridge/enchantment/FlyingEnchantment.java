package edu.serjmaks.patterns.structural.bridge.enchantment;

public class FlyingEnchantment implements Enchantment {
    @Override
    public void apply() {
        System.out.println("the item flies and strikes the enemies finally returning to owner's hand");
    }
}

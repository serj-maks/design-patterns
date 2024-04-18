package edu.serjmaks.patterns.structural.bridge.enchantment;

public class SoulEatingEnchantment implements Enchantment {
    @Override
    public void apply() {
        System.out.println("the item eats the soul of enemies");
    }
}

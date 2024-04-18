package edu.serjmaks.patterns.structural.bridge;

import edu.serjmaks.patterns.structural.bridge.enchantment.FlyingEnchantment;
import edu.serjmaks.patterns.structural.bridge.enchantment.SoulEatingEnchantment;
import edu.serjmaks.patterns.structural.bridge.weapon.sword.MetalSword;
import edu.serjmaks.patterns.structural.bridge.weapon.sword.Sword;
import edu.serjmaks.patterns.structural.bridge.weapon.sword.WoodSword;

public class Demo {
    public static void main(String[] args) {
        Sword woodenSword = new WoodSword(new SoulEatingEnchantment());
        woodenSword.swing();

        Sword metalSword = new MetalSword(new FlyingEnchantment());
        metalSword.swing();
    }
}

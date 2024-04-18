package edu.serjmaks.patterns.structural.bridge.weapon.sword;


import edu.serjmaks.patterns.structural.bridge.enchantment.Enchantment;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class WoodSword extends Sword {

    private final Enchantment enchantment;

    @Override
    public void swing() {
        System.out.println("the wooden sword is swung");
        enchantment.apply();
    }
}

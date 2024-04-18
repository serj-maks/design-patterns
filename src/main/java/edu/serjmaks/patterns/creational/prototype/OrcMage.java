package edu.serjmaks.patterns.creational.prototype;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(makeFinal=true, level= AccessLevel.PRIVATE)
public class OrcMage extends Mage {
    String weapon;

    public OrcMage(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "orcish mage attack with " + weapon;
    }
}

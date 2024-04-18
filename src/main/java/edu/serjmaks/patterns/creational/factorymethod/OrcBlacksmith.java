package edu.serjmaks.patterns.creational.factorymethod;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public class OrcBlacksmith implements Blacksmith {

    private static final Map<WeaponType, OrcWeapon> ORC_ARSENAL;

    static {
        ORC_ARSENAL = new EnumMap<>(WeaponType.class);
        Arrays.stream(WeaponType.values()).forEach(type -> ORC_ARSENAL.put(type, new OrcWeapon(type)));
    }
    @Override
    public Weapon manufactureWeapon(WeaponType type) {
        return ORC_ARSENAL.get(type);
    }

    @Override
    public String toString() {
        return "the orc blacksmith";
    }
}

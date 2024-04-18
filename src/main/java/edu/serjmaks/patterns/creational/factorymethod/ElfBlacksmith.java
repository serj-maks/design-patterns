package edu.serjmaks.patterns.creational.factorymethod;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public class ElfBlacksmith implements Blacksmith {

    private static final Map<WeaponType, ElfWeapon> ELF_ARSENAL;

    static {
        ELF_ARSENAL = new EnumMap<>(WeaponType.class);
        Arrays.stream(WeaponType.values()).forEach(type -> ELF_ARSENAL.put(type, new ElfWeapon(type)));
    }
    @Override
    public Weapon manufactureWeapon(WeaponType type) {
        return ELF_ARSENAL.get(type);
    }

    @Override
    public String toString() {
       return "the elf blacksmith";
    }
}

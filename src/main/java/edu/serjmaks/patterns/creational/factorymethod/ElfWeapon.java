package edu.serjmaks.patterns.creational.factorymethod;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ElfWeapon implements Weapon {

    private final WeaponType weaponType;

    @Override
    public WeaponType getType() {
        return weaponType;
    }

    @Override
    public String toString() {
        return "an elven " + weaponType;
    }
}

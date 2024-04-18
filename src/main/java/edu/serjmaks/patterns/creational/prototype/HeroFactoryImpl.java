package edu.serjmaks.patterns.creational.prototype;


import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RequiredArgsConstructor
@FieldDefaults(makeFinal=true, level= AccessLevel.PRIVATE)
public class HeroFactoryImpl implements HeroFactory {
    Mage mage;
    Beast beast;

    @Override
    public Mage createMage() {
        return mage.copy();
    }

    @Override
    public Beast createBeast() {
        return beast.copy();
    }
}

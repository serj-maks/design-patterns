package edu.serjmaks.patterns.structural.adapter;

import edu.serjmaks.patterns.structural.adapter.lion.Lion;
import edu.serjmaks.patterns.structural.adapter.wilddog.WildDog;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class WildDogAdapter implements Lion {

    private WildDog wildDog;
    @Override
    public void roar() {
        wildDog.bark();
    }
}

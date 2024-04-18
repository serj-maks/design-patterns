package edu.serjmaks.patterns.creational.prototype;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public abstract class Mage extends Prototype<Mage> {

    public Mage(Mage source) {

    }
}

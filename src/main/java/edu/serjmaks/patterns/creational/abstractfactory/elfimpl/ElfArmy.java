package edu.serjmaks.patterns.creational.abstractfactory.elfimpl;

import edu.serjmaks.patterns.creational.abstractfactory.Army;

public class ElfArmy implements Army {

    @Override
    public String getDescription() {
        return "this is the elvin army";
    }
}

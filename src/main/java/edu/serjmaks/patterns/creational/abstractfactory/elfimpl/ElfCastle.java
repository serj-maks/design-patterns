package edu.serjmaks.patterns.creational.abstractfactory.elfimpl;

import edu.serjmaks.patterns.creational.abstractfactory.Castle;

public class ElfCastle implements Castle {

    @Override
    public String getDescription() {
        return "This is the elven castle";
    }
}

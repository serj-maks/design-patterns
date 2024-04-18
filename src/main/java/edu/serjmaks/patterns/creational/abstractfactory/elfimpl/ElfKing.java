package edu.serjmaks.patterns.creational.abstractfactory.elfimpl;

import edu.serjmaks.patterns.creational.abstractfactory.King;

public class ElfKing implements King {

    @Override
    public String getDescription() {
        return "this is the elvin king";
    }
}

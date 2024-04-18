package edu.serjmaks.patterns.creational.abstractfactory.orcimpl;

import edu.serjmaks.patterns.creational.abstractfactory.Castle;

public class OrcCastle implements Castle {

    @Override
    public String getDescription() {
        return "this is the orc castle";
    }
}

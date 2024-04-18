package edu.serjmaks.patterns.creational.abstractfactory.orcimpl;

import edu.serjmaks.patterns.creational.abstractfactory.Army;

public class OrcArmy implements Army {
    @Override
    public String getDescription() {
        return "this is the orc army";
    }
}

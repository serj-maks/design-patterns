package edu.serjmaks.patterns.creational.abstractfactory.orcimpl;

import edu.serjmaks.patterns.creational.abstractfactory.King;

public class OrcKing implements King {
    @Override
    public String getDescription() {
        return "this is the orc king";
    }
}

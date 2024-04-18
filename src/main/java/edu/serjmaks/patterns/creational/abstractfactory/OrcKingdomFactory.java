package edu.serjmaks.patterns.creational.abstractfactory;

import edu.serjmaks.patterns.creational.abstractfactory.orcimpl.OrcArmy;
import edu.serjmaks.patterns.creational.abstractfactory.orcimpl.OrcCastle;
import edu.serjmaks.patterns.creational.abstractfactory.orcimpl.OrcKing;

public class OrcKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new OrcCastle();
    }

    @Override
    public King createKing() {
        return new OrcKing();
    }

    @Override
    public Army createArmy() {
        return new OrcArmy();
    }
}

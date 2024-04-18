package edu.serjmaks.patterns.creational.abstractfactory;

import edu.serjmaks.patterns.creational.abstractfactory.elfimpl.ElfArmy;
import edu.serjmaks.patterns.creational.abstractfactory.elfimpl.ElfCastle;
import edu.serjmaks.patterns.creational.abstractfactory.elfimpl.ElfKing;

public class ElfKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new ElfCastle();
    }

    @Override
    public King createKing() {
        return new ElfKing();
    }

    @Override
    public Army createArmy() {
        return new ElfArmy();
    }
}

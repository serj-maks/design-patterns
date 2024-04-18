package edu.serjmaks.patterns.creational.abstractfactory;

// the factory of kingdom factories
public class KingdomUtils {

    public static KingdomFactory createFactory(KingdomType type) {
        return switch (type) {
            case ELF -> new ElfKingdomFactory();
            case ORC -> new OrcKingdomFactory();
        };
    }
}

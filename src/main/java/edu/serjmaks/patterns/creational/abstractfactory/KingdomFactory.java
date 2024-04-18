package edu.serjmaks.patterns.creational.abstractfactory;

public interface KingdomFactory {
    Castle createCastle();
    King createKing();
    Army createArmy();
}

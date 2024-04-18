package edu.serjmaks.patterns.creational.abstractfactory;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Kingdom {

    King king;
    Castle castle;
    Army army;

    public void createKingdom(KingdomType type) {
        final KingdomFactory factory = KingdomUtils.createFactory(type);
        this.setArmy(factory.createArmy());
        this.setCastle(factory.createCastle());
        this.setKing(factory.createKing());
    }
}

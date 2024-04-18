package edu.serjmaks.patterns.creational.abstractfactory;

public class Demo {
    public static void main(String[] args) {
        Kingdom kingdom = new Kingdom();
        System.out.println("elf kingdom:");
        kingdom.createKingdom(KingdomType.ELF);
        System.out.println(kingdom.getArmy().getDescription());
        System.out.println(kingdom.getCastle().getDescription());
        System.out.println(kingdom.getKing().getDescription());

        kingdom.createKingdom(KingdomType.ORC);
        System.out.println("orc kingdom:");
        System.out.println(kingdom.getArmy().getDescription());
        System.out.println(kingdom.getCastle().getDescription());
        System.out.println(kingdom.getKing().getDescription());
    }
}

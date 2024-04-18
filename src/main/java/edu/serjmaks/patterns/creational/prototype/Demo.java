package edu.serjmaks.patterns.creational.prototype;

public class Demo {
    public static void main(String[] args) {
        HeroFactory heroFactory = new HeroFactoryImpl(
                new OrcMage("staff"),
                new OrcBeast("protecting")
        );

        Mage orcMage = heroFactory.createMage();
        Beast orcBeast = heroFactory.createBeast();

        System.out.println(orcMage.toString());
        System.out.println(orcBeast.toString());
    }
}

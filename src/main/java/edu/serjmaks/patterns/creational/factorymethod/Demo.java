package edu.serjmaks.patterns.creational.factorymethod;

public class Demo {

    public static void main(String[] args) {
        Blacksmith elfBlacksmith = new ElfBlacksmith();
        Weapon elfSword = elfBlacksmith.manufactureWeapon(WeaponType.SWORD);
        System.out.println(elfBlacksmith + " manufactured: " + elfSword);

        Blacksmith orcBlacksmith = new OrcBlacksmith();
        Weapon orcAxe = orcBlacksmith.manufactureWeapon(WeaponType.AXE);
        Weapon orcMace = orcBlacksmith.manufactureWeapon(WeaponType.MACE);
        System.out.println(orcBlacksmith + " manufactured: " + orcAxe + " and " + orcMace);
    }
}

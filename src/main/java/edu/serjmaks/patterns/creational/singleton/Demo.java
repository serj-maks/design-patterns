package edu.serjmaks.patterns.creational.singleton;

public class Demo {
    public static void main(String[] args) {
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE.getInstance();
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE.getInstance();

        System.out.println(enumSingleton1.getInfo());
        System.out.println(enumSingleton2.getInfo());

        ClassicSingleton classicSingleton1 = ClassicSingleton.getInstance();
        ClassicSingleton classicSingleton2 = ClassicSingleton.getInstance();

        System.out.println(classicSingleton1.getInfo());
        System.out.println(classicSingleton2.getInfo());
    }
}

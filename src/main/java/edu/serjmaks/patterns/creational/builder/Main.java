package edu.serjmaks.patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        User yaro = new UserBuilder()
                .setName("yaro")
                .setAge(4)
                .build(); //без email

        System.out.println(yaro);

        User nat = new UserBuilder()
                .setName("nat")
                .setAge(30)
                .setEmail("coolgirl@mail.ru")
                .build();

        System.out.println(nat);
    }
}

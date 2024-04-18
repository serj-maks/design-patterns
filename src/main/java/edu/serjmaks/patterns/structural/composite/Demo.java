package edu.serjmaks.patterns.structural.composite;

public class Demo {
    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        messenger.messageFromElves().print();
        messenger.messageFromOrcs().print();
    }
}

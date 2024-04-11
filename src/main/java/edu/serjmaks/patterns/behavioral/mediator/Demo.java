package edu.serjmaks.patterns.behavioral.mediator;

public class Demo {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        User serj = new User("serj", chatRoom);
        User nat = new User("nat", chatRoom);

        serj.send("Hey!");
        nat.send("Hello!");
    }
}

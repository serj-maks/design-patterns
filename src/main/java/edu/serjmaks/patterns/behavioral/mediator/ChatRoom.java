package edu.serjmaks.patterns.behavioral.mediator;

import java.time.LocalDateTime;

// mediator
public class ChatRoom {

    public void showMessage(User user, String message) {
        LocalDateTime time = LocalDateTime.now();
        String sender = user.getName();
        System.out.println(time + " [" + sender + "]: " + message);
    }
}

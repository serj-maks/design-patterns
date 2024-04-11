package edu.serjmaks.patterns.behavioral.mediator;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PROTECTED)
public class User {
    @Getter
    String name;

    ChatRoom chatRoom;

    public void send(String message) {
        this.chatRoom.showMessage(this, message);
    }
}




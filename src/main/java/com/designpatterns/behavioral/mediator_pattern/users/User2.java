package com.designpatterns.behavioral.mediator_pattern.users;

import com.designpatterns.behavioral.mediator_pattern.ApnaChatRoom;
import com.designpatterns.behavioral.mediator_pattern.Participant;

public class User2 extends Participant {
    private String name;
    private final ApnaChatRoom chatRoom;

    public User2(ApnaChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }

    @Override
    public void sendMessage(String message) {
        this.chatRoom.showMessage(message, this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}

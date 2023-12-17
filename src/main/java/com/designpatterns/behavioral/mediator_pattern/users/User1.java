package com.designpatterns.behavioral.mediator_pattern.users;

import com.designpatterns.behavioral.mediator_pattern.ApnaChatRoom;
import com.designpatterns.behavioral.mediator_pattern.Participant;

public class User1 extends Participant {
    private String name;
    private ApnaChatRoom chatRoom;

    public User1(ApnaChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }

    @Override
    public void sendMessage(String message) {
        chatRoom.showMessage(message, this);
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

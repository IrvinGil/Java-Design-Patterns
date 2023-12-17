package com.designpatterns.behavioral.mediator_pattern;

import com.designpatterns.behavioral.mediator_pattern.users.User1;
import com.designpatterns.behavioral.mediator_pattern.users.User2;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        ApnaChatRoom chatRoom = new ApnaChatRoomImpl();

        User1 user1 = new User1(chatRoom);
        user1.setName("Joy Boy");
        user1.sendMessage("Hi Joy Boy! How are you?");

        User2 user2 = new User2(chatRoom);
        user2.setName("Aokiji");
        user2.sendMessage("Hi Aokiji! How are you?");
    }
}

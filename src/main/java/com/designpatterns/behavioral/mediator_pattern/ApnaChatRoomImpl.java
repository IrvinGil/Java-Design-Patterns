package com.designpatterns.behavioral.mediator_pattern;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ApnaChatRoomImpl implements ApnaChatRoom {
    //get current date time
    DateFormat dateFormat = new SimpleDateFormat("E dd-MM-yyyy hh:mm a");
    Date date = new Date();


    @Override
    public void showMessage(String message, Participant participant) {
        System.out.println(participant.getName() + "'gets message: " + message);
        System.out.println("\t\t\t\t" + "[" + dateFormat.format(date) + "]");
    }
}

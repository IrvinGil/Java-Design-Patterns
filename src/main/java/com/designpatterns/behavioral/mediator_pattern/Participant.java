package com.designpatterns.behavioral.mediator_pattern;

public abstract class Participant {
    public abstract void sendMessage(String message);

    public abstract String getName();

    public abstract void setName(String name);
}

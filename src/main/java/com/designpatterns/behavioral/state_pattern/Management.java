package com.designpatterns.behavioral.state_pattern;

public class Management implements Connection{
    @Override
    public void open() {
        System.out.println("Open database for management");
    }

    @Override
    public void close() {
        System.out.println("Close the database for management");
    }

    @Override
    public void log() {
        System.out.println("Log activities for management");
    }

    @Override
    public void update() {
        System.out.println("Management has been updated");
    }
}

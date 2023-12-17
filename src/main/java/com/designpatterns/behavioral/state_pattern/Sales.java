package com.designpatterns.behavioral.state_pattern;

public class Sales implements Connection{
    @Override
    public void open() {
        System.out.println("Open database for sales");
    }

    @Override
    public void close() {
        System.out.println("Close the database for sales");
    }

    @Override
    public void log() {
        System.out.println("Log activities for sales");
    }

    @Override
    public void update() {
        System.out.println("Sales has been updated");
    }
}

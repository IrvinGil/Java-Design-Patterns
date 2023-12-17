package com.designpatterns.behavioral.state_pattern;

public class Accounting implements Connection{
    @Override
    public void open() {
        System.out.println("Open database for accounting");
    }

    @Override
    public void close() {
        System.out.println("Close the database for accounting");
    }

    @Override
    public void log() {
        System.out.println("Log activities for accounting");
    }

    @Override
    public void update() {
        System.out.println("Accounting has been updated");
    }
}

package com.designpatterns.behavioral.chain_of_responsibility_pattern;

public class ConsoleBasedLogger extends Logger {

    public ConsoleBasedLogger(int levels) {
        this.levels = levels;
    }

    @Override
    protected void displayLogInfo(String message) {
        System.out.println("Console logger info: >> " + message);
    }
}

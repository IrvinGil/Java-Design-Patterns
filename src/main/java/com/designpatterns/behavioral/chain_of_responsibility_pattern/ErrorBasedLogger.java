package com.designpatterns.behavioral.chain_of_responsibility_pattern;

public class ErrorBasedLogger extends Logger {
    public ErrorBasedLogger(int levels) {
        this.levels = levels;
    }

    @Override
    protected void displayLogInfo(String message) {
        System.out.println("Error logger info: >> " + message);
    }
}

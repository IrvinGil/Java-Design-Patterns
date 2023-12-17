package com.designpatterns.behavioral.observer_pattern;

public class ResponseHandler2 implements Observer, Printable {
    Subject subject;
    String message;

    public ResponseHandler2(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String message) {
        this.message = message;
        printMessage();
    }

    @Override
    public void printMessage() {
        System.out.println("\nResponseHandler1 >> " + this.message);
    }
}

package com.designpatterns.behavioral.observer_pattern;


import java.util.ArrayList;

public class EventSource implements Subject {
    private final ArrayList<Observer> observers;
    private String message;

    public EventSource() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0) observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
        messageChanged();
    }

    private void messageChanged() {
        notifyObservers();
    }
}

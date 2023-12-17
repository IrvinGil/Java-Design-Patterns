package com.designpatterns.behavioral.state_pattern;

public interface Connection {
    void open();

    void close();

    void log();

    void update();
}

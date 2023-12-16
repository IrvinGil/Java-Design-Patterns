package com.designpatterns.behavioral.chain_of_responsibility_pattern;

public abstract class Logger {
    public static int OUTPUT_INFO = 1;
    public static int ERROR_INFO = 2;
    public static int DEBUG_INFO = 3;
    protected int levels;
    protected Logger nextLevelLogger;

    public void setNextLevelLogger(Logger nextLevelLogger) {
        this.nextLevelLogger = nextLevelLogger;
    }

    public void logMessage(int levels, String message) {
        if (this.levels <= levels) displayLogInfo(message);

        if (nextLevelLogger != null) nextLevelLogger.logMessage(levels, message);
    }

    protected abstract void displayLogInfo(String message);
}

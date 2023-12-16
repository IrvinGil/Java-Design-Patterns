package com.designpatterns.behavioral.chain_of_responsibility_pattern;

public class ChainOfResponsibilityClient {
    private static Logger doChanning() {

        Logger consoleLogger = new ConsoleBasedLogger(Logger.OUTPUT_INFO);

        Logger errorLogger = new ErrorBasedLogger(Logger.ERROR_INFO);
        consoleLogger.setNextLevelLogger(errorLogger);

        Logger debugLogger = new ErrorBasedLogger(Logger.DEBUG_INFO);
        errorLogger.setNextLevelLogger(debugLogger);

        return consoleLogger;
    }

    public static void main(String args[]){
        Logger chainLogger = doChanning();

        chainLogger.logMessage(Logger.OUTPUT_INFO, "Enter the sequence values");
        chainLogger.logMessage(Logger.ERROR_INFO, "An error has occurred now");
        chainLogger.logMessage(Logger.DEBUG_INFO, "This was the error. Now, debugging is compiled!.");

    }
}

package com.designpatterns.creational.objectpool;

public class ExportingProcess {
    private long processNumber;

    public ExportingProcess(long processNumber) {
        this.processNumber = processNumber;

        // do some expensive call/tasks in here in the future

        System.out.println("Object with process no. " + processNumber + " was created.");

    }

    public long getProcessNumber() {
        return processNumber;
    }
}

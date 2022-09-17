package com.designPatterns.creationalPatterns.objectPoolPattern;

public class ExportingTask implements Runnable {
    private ObjectPool<ExportingProcess> pool;
    private int threadNo;

    public ExportingTask(ObjectPool<ExportingProcess> pool, int threadNo) {
        this.pool = pool;
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        // get an object from the pool

        ExportingProcess exportingProcess = pool.borrowObject();
        System.out.println("Thread " + threadNo + ": Object with process no. " + exportingProcess.getProcessNumber() + " was borrowed.");

        // you can add some codes here in the future

        pool.returnObject(exportingProcess);
        System.out.println("Thread " + threadNo + ": Object with process no." + exportingProcess.getProcessNumber() + " was returned");

    }
}

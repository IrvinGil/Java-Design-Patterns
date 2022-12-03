package com.designpatterns.creational.objectpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class ObjectPoolDemo {
    private ObjectPool<ExportingProcess> pool;
    private AtomicLong processNo = new AtomicLong(0);

    public void setup() {
        // Create a pool of objects of type ExportingProcess
        /**
         *  Parameters
         *  1. Minimum number of special ExportingProcess instance residing in the pool = 4
         *  2. Maximum number of special ExportingProcess instance residing int the pool = 10
         *  3. Time in seconds for periodical checking on minObjects/maxObjects conditions
         *  ia separate thread = 5.
         *  --> When the number of ExportingProcess instance is less than minObjects, missing instance will be created.
         *  --> When the number of ExportingProcess instance is greater than maxObjects, too many instances will be removed.
         *  --> If the validation interval is negative, no periodical checking of minObjects/maxObjects conditions in a separate thread takes place.
         *  These boundaries are ignore by then.
         *  */

        pool = new ObjectPool<ExportingProcess>(4, 10, 5) {

            protected ExportingProcess createObject() {
                // create a test object which takes some time for creation
                return new ExportingProcess(processNo.incrementAndGet());
            }
        };
    }

    public void tearDown() {
        pool.shutdown();
    }

    public void testObjectPool() {
        ExecutorService executor = Executors.newFixedThreadPool(8);

        executor.execute(new ExportingTask(pool, 1));
        executor.execute(new ExportingTask(pool, 2));
        executor.execute(new ExportingTask(pool, 3));
        executor.execute(new ExportingTask(pool, 4));
        executor.execute(new ExportingTask(pool, 5));
        executor.execute(new ExportingTask(pool, 6));
        executor.execute(new ExportingTask(pool, 7));
        executor.execute(new ExportingTask(pool, 8));

        executor.shutdown();
        try {
            executor.awaitTermination(30, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String args[]) {
        ObjectPoolDemo op = new ObjectPoolDemo();
        op.setup();
        op.tearDown();
        op.testObjectPool();
    }
}

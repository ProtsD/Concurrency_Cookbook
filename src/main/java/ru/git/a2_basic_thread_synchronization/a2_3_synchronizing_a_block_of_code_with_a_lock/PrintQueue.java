package ru.git.a2_basic_thread_synchronization.a2_3_synchronizing_a_block_of_code_with_a_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintQueue {
    private Lock queueLock;

    public PrintQueue(boolean fairMode) {
        queueLock = new ReentrantLock(fairMode);
    }

    public void printJob(Object document) {
        queueLock.lock();
        try {
            Long duration = (long) (Math.random() * 10000);
            System.out.println(Thread.currentThread().getName() +
                    ": PrintQueue:Printing a Job during " + (duration / 1000) + " seconds");
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            queueLock.unlock();
        }
    }
}

package ru.git.a10_additional_information.a10_5_monitoring_a_semaphore_class;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Task implements Runnable {
    private final Semaphore semaphore;

    public Task(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.printf("%s: Get the semaphore.\n", Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(2);
            System.out.println(Thread.currentThread().getName() + ": Release the semaphore.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}

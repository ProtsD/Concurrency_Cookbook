package ru.git.a8_customizing_concurrency_classes.a8_8_implementing_a_custom_lock_class;

import java.util.concurrent.TimeUnit;

public class Task implements Runnable {
    private final MyLock lock;
    private final String name;

    public Task(String name, MyLock lock) {
        this.lock = lock;
        this.name = name;
    }

    @Override
    public void run() {
        lock.lock();
        System.out.printf("Task: %s: Take the lock\n", name);
        try {
            TimeUnit.SECONDS.sleep(2);
            System.out.printf("Task: %s: Free the lock\n", name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

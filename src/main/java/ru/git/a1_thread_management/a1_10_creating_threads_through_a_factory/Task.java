package ru.git.a1_thread_management.a1_10_creating_threads_through_a_factory;

import java.util.concurrent.TimeUnit;

public class Task implements Runnable {
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

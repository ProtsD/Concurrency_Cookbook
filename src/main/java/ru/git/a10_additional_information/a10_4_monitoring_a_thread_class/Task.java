package ru.git.a10_additional_information.a10_4_monitoring_a_thread_class;

import java.util.concurrent.TimeUnit;

public class Task implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("%s: %d\n", Thread.currentThread().getName(), i);
        }
    }
}

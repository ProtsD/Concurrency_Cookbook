package ru.git.a1_thread_management.a1_9_grouping_threads_and_processing_uncontrolled_exceptions_in_a_group;

import java.util.Random;

public class Task implements Runnable {
    @Override
    public void run() {
        int result;
        Random random = new Random(Thread.currentThread().getId());
        while (true) {
            result = 1000 / ((int) (random.nextDouble() * 1000000000));
            if (Thread.currentThread().isInterrupted()) {
                System.out.printf("%d : Interrupted\n", Thread.currentThread().getId());
                return;
            }
        }
    }
}

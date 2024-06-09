package ru.git.a10_additional_information.a10_6_generating_concurrent_random_numbers;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TaskLocalRandom implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s: %d\n", name, ThreadLocalRandom.current().nextInt(10));
        }
    }
}

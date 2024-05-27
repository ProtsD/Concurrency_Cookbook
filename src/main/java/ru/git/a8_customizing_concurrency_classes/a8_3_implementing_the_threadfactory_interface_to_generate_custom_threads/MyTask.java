package ru.git.a8_customizing_concurrency_classes.a8_3_implementing_the_threadfactory_interface_to_generate_custom_threads;

import java.util.concurrent.TimeUnit;

public class MyTask implements Runnable {
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

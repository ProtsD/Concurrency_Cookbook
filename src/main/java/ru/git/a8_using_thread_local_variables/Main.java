package ru.git.a8_using_thread_local_variables;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
//        SafeTask task = new SafeTask();
        UnsafeTask task = new UnsafeTask();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(task);
            thread.start();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

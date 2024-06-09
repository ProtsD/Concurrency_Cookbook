package ru.git.a9_testing_concurrent_applications.a9_7_analyzing_concurrent_code_with_findbugs;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        for (int i = 0; i < 10; i++) {
            Task task = new Task(lock);
            Thread thread = new Thread(task);
            thread.run();
        }
    }
}

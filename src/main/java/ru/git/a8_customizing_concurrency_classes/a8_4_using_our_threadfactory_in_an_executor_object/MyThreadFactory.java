package ru.git.a8_customizing_concurrency_classes.a8_4_using_our_threadfactory_in_an_executor_object;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class MyThreadFactory implements ThreadFactory {
    private AtomicInteger counter;
    private String prefix;

    public MyThreadFactory(String prefix) {
        this.prefix = prefix;
        counter = new AtomicInteger(1);
    }

    @Override
    public MyThread newThread(Runnable r) {
        MyThread myThread = new MyThread(r, "/*/*/" + prefix + "-" + counter.getAndIncrement());
        return myThread;
    }
}

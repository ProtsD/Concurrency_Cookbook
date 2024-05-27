package ru.git.a8_customizing_concurrency_classes.a8_6_implementing_the_threadfactory_interface_to_generate_custom_threads_for_the_fork_join_framework;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinWorkerThread;

public class MyWorkerThread extends ForkJoinWorkerThread {
    private final static ThreadLocal<Integer> taskCounter = new ThreadLocal<Integer>();

    protected MyWorkerThread(ForkJoinPool pool) {
        super(pool);
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.printf("MyWorkerThread %d: Initializing task counter.\n", getId());
        taskCounter.set(0);
    }

    @Override
    protected void onTermination(Throwable exception) {
        System.out.printf("MyWorkerThread %d: %d\n", getId(), taskCounter.get());
        super.onTermination(exception);
    }

    public void addTask() {
        taskCounter.set(taskCounter.get() + 1);
    }
}

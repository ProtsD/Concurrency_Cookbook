package ru.git.a8_customizing_concurrency_classes.a8_6_implementing_the_threadfactory_interface_to_generate_custom_threads_for_the_fork_join_framework;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinWorkerThread;

public class MyWorkerThreadFactory implements ForkJoinPool.ForkJoinWorkerThreadFactory {
    @Override
    public ForkJoinWorkerThread newThread(ForkJoinPool pool) {
        return new MyWorkerThread(pool);
    }
}

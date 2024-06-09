package ru.git.a10_additional_information.a10_2_processing_uncontrolled_exceptions_in_a_forkjoinpool_class;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        OneSecondLongTask task = new OneSecondLongTask();
        Handler handler = new Handler();
        AlwaysThrowsExceptionWorkerThreadFactory factory = new AlwaysThrowsExceptionWorkerThreadFactory();
        ForkJoinPool pool = new ForkJoinPool(2, factory, handler, false);
        pool.execute(task);
        pool.shutdown();
        try {
            pool.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Task: Finish.\n");
    }
}

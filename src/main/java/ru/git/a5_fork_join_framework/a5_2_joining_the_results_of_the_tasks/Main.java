package ru.git.a5_fork_join_framework.a5_2_joining_the_results_of_the_tasks;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        DocumentMock mock = new DocumentMock();
        String[][] document = mock.generateDocument(100, 1000, "the");
        DocumentTask task = new DocumentTask(document, 0, 100, "the");
        ForkJoinPool commonPool = ForkJoinPool.commonPool();
        commonPool.execute(task);
        do {
            System.out.printf("******************************************\n");
            System.out.printf("Main: Active Threads: %d\n", commonPool.getActiveThreadCount());
            System.out.printf("Main: Task Count: %d\n", commonPool.getQueuedTaskCount());
            System.out.printf("Main: Steal Count: %d\n", commonPool.getStealCount());
            System.out.printf("******************************************\n");
            try {
                TimeUnit.MILLISECONDS.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (!task.isDone());
        commonPool.shutdown();
        try {
            commonPool.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            System.out.printf("Main: The word appears %d in the document", task.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}

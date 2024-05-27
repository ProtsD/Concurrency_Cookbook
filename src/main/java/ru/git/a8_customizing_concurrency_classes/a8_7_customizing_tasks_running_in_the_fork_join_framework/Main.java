package ru.git.a8_customizing_concurrency_classes.a8_7_customizing_tasks_running_in_the_fork_join_framework;

import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] array = new int[10000];
        ForkJoinPool pool = new ForkJoinPool();
        Task task = new Task("Task", array, 0, array.length);
        pool.invoke(task);
        pool.shutdown();
        System.out.printf("Main: End of the program.\n");
    }
}

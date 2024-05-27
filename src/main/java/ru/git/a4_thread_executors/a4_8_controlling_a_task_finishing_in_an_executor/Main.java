package ru.git.a4_thread_executors.a4_8_controlling_a_task_finishing_in_an_executor;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        ResultTask[] resultTasks = new ResultTask[5];
        for (int i = 0; i < 5; i++) {
            ExecutableTask executableTask = new ExecutableTask("Task " + i);
            resultTasks[i] = new ResultTask(executableTask);
            executor.submit(resultTasks[i]);
        }
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        for (int i = 0; i < resultTasks.length; i++) {
            resultTasks[i].cancel(true);
        }
        for (int i = 0; i < resultTasks.length; i++) {
            try {
                if (!resultTasks[i].isCancelled()) {
                    System.out.printf("%s\n", resultTasks[i].get());
                }
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }
}

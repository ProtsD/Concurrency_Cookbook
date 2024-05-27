package ru.git.a4_thread_executors.a4_1_creating_a_thread_executor_and_controlling_its_rejected_tasks;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class RejectedTaskController implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.printf("RejectedTaskController: The task %s has been rejected\n", r.toString());
        System.out.printf("RejectedTaskController: %s\n", executor.toString());
        System.out.printf("RejectedTaskController: Terminating: %s\n", executor.isTerminating());
        System.out.printf("RejectedTaskController: Terminated: %s\n", executor.isTerminated());
    }
}

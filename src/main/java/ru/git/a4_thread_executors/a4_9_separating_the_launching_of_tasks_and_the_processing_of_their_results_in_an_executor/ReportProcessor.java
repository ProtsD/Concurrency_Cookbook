package ru.git.a4_thread_executors.a4_9_separating_the_launching_of_tasks_and_the_processing_of_their_results_in_an_executor;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ReportProcessor implements Runnable {
    private final CompletionService<String> service;
    private volatile boolean end;

    public ReportProcessor(CompletionService<String> service) {
        this.service = service;
        end = false;
    }

    @Override
    public void run() {
        while (!end) {
            try {
                Future<String> result = service.poll(20, TimeUnit.SECONDS);
                if (result != null) {
                    String report = result.get();
                    System.out.printf("ReportReceiver: Report Received: %s\n", report);
                }
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("ReportSender: End\n");
    }

    public void stopProcessing() {
        this.end = true;
    }
}

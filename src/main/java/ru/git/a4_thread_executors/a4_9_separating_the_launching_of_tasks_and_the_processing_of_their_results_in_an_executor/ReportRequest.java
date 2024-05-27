package ru.git.a4_thread_executors.a4_9_separating_the_launching_of_tasks_and_the_processing_of_their_results_in_an_executor;

import java.util.concurrent.CompletionService;

public class ReportRequest implements Runnable {
    private final String name;
    private final CompletionService<String> service;

    public ReportRequest(String name, CompletionService<String> service) {
        this.name = name;
        this.service = service;
    }

    @Override
    public void run() {
        ReportGenerator reportGenerator = new ReportGenerator(name, "Report");
        service.submit(reportGenerator);
    }
}

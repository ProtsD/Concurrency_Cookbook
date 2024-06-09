package ru.git.a10_additional_information.a10_1_processing_results_for_runnable_objects_in_the_executor_framework;

import java.util.Calendar;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Task extends FutureTask<List<String>> {
    private FileSearch fileSearch;
    public Task(Runnable runnable, List<String> result) {
        super(runnable, result);
        this.fileSearch = (FileSearch) runnable;
    }

    @Override
    protected void set(List<String> v) {
        v = fileSearch.getResults();
        super.set(v);
    }
}

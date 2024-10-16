package ru.git.a3_thread_synchronization_utilities.a3_7_completing_and_linking_tasks_asynchronously;

import java.util.List;
import java.util.function.Function;

public class NumberSelector implements Function<List<Long>, Long> {
    @Override
    public Long apply(List<Long> list) {

        System.out.printf("%s: Step 3: Start\n",
                Thread.currentThread().getName());
        long max = list.stream().max(Long::compare).get();
        long min = list.stream().min(Long::compare).get();
        long result = (max + min) / 2;
        System.out.printf("%s: Step 3: Result - %d\n",
                Thread.currentThread().getName(), result);
        return result;
    }
}

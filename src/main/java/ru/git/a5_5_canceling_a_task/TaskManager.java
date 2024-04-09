package ru.git.a5_5_canceling_a_task;

import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ForkJoinTask;

public class TaskManager {
    private final ConcurrentLinkedDeque<SearchNumberTask> tasks;

    public TaskManager() {
        tasks = new ConcurrentLinkedDeque<>();
    }

    public void addTask(SearchNumberTask task) {
        tasks.add(task);
    }

    public void cancelTasks(SearchNumberTask cancelTask) {
        for (SearchNumberTask task : tasks) {
            if (task != cancelTask) {
                task.cancel(true);
                task.logCancelMessage();
            }
        }
    }
}

package ru.git.a8_customizing_concurrency_classes.a8_7_customizing_tasks_running_in_the_fork_join_framework;

public class Task extends MyWorkerTask {
    private int array[];
    private int start, end;

    public Task(String name, int[] array, int start, int end) {
        super(name);
        this.array = array;
        this.start = start;
        this.end = end;
    }

    protected void compute() {
        if (end - start > 100) {
            int mid = (end + start) / 2;
            Task task1 = new Task(this.getName() + "1", array, start, mid);
            Task task2 = new Task(this.getName() + "2", array, mid, end);
            invokeAll(task1, task2);
        } else {
            for (int i = start; i < end; i++) {
                array[i]++;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

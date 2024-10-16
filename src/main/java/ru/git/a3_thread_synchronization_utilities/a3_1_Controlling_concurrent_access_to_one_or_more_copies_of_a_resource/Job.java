package ru.git.a3_thread_synchronization_utilities.a3_1_Controlling_concurrent_access_to_one_or_more_copies_of_a_resource;

public class Job implements Runnable {
    private final PrintQueue printQueue;

    public Job(PrintQueue printQueue) {
        this.printQueue = printQueue;
    }

    @Override
    public void run() {
        System.out.printf("%s: Going to print a job\n", Thread.currentThread().getName());
        printQueue.printJob(new Object());
        System.out.printf("%s: The document has been printed\n", Thread.currentThread().getName());
    }
}

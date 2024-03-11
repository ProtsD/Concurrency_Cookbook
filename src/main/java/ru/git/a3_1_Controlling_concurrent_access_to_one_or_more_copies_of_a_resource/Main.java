package ru.git.a3_1_Controlling_concurrent_access_to_one_or_more_copies_of_a_resource;

public class Main {
    public static void main(String[] args) {
        PrintQueue printQueue = new PrintQueue();
        Thread[] threads = new Thread[12];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Job(printQueue), "Thread" + i);
        }
        for (Thread thread : threads) {
            thread.start();
        }
    }
}

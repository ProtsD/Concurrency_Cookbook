package ru.git.a2_basic_thread_synchronization.a2_2_using_conditions_in_synchronized_code;

public class Main {
    public static void main(String[] args) {
        EventStorage storage = new EventStorage();
        Producer producer = new Producer(storage);
        Thread thread1 = new Thread(producer);
        Consumer consumer = new Consumer(storage);
        Thread thread2 = new Thread(consumer);
        thread2.start();
        thread1.start();
    }

}

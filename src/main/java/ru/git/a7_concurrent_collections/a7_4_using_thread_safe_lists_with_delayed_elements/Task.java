package ru.git.a7_concurrent_collections.a7_4_using_thread_safe_lists_with_delayed_elements;

import java.util.Date;
import java.util.concurrent.DelayQueue;

public class Task implements Runnable {
    private final int id;
    private final DelayQueue<Event> queue;

    public Task(int id, DelayQueue<Event> queue) {
        this.id = id;
        this.queue = queue;
    }

    @Override
    public void run() {
        Date now = new Date();
        Date delay = new Date();
        delay.setTime(now.getTime() + (id * 1000));
        System.out.printf("Thread %s: %s\n", id, delay);
        for (int i = 0; i < 100; i++) {
            Event event = new Event(delay);
            queue.add(event);
        }
    }
}

package ru.git.a7_concurrent_collections.a7_3_using_blocking_thread_safe_queue_ordered_by_priority;

public class Event implements Comparable<Event> {
    private final int thread;
    private final int priority;

    public Event(int thread, int priority) {
        this.thread = thread;
        this.priority = priority;
    }

    public int getThread() {
        return thread;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Event e) {
        if (this.priority > e.getPriority()) {
            return -1;
        } else if (this.priority < e.getPriority()) {
            return 1;
        } else {
            return 0;
        }
    }
}

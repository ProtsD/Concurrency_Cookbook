package ru.git.a8_customizing_concurrency_classes.a8_9_implementing_a_transfer_queue_based_on_priorities;

public class Event implements Comparable<Event> {
    private final String thread;
    private final int priority;

    public Event(String thread, int priority) {
        this.thread = thread;
        this.priority = priority;
    }

    public String getThread() {
        return thread;
    }

    public int getPriority() {
        return priority;
    }

    public int compareTo(Event e) {
        return Integer.compare(e.priority, this.getPriority());
    }
}

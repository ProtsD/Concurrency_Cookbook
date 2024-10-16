package ru.git.a3_thread_synchronization_utilities.a3_2_waiting_for_multiple_concurrent_events;

import java.util.concurrent.TimeUnit;

public class Participant implements Runnable {
    private final Videoconference conference;
    private final String name;

    public Participant(Videoconference conference, String name) {
        this.conference = conference;
        this.name = name;
    }

    @Override
    public void run() {
        long duration = (long) (Math.random() * 10);
        try {
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        conference.arrive(name);
    }
}

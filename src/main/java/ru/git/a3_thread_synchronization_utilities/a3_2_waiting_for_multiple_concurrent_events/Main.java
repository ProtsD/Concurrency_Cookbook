package ru.git.a3_thread_synchronization_utilities.a3_2_waiting_for_multiple_concurrent_events;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Videoconference conference = new Videoconference(10);
        Thread threadConference = new Thread(conference);
        threadConference.start();
        for (int i = 0; i < 10; i++) {
            Participant p = new Participant(conference, "Participant " + i);
            Thread t = new Thread(p);
            t.start();
        }
        TimeUnit.SECONDS.sleep(60);
        for (int i = 0; i < 10; i++) {
            Participant p = new Participant(conference, "Participant 1" + i);
            Thread t = new Thread(p);
            t.start();
        }
    }
}

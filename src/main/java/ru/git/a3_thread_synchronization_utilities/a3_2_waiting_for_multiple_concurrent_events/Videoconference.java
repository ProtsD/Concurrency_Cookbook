package ru.git.a3_thread_synchronization_utilities.a3_2_waiting_for_multiple_concurrent_events;

import java.util.concurrent.CountDownLatch;

public class Videoconference implements Runnable {
    private final CountDownLatch controller;

    public Videoconference(int number) {
        controller = new CountDownLatch(number);
    }

    public void arrive(String name) {
        System.out.printf("%s has arrived.", name);
        controller.countDown();
        System.out.printf("VideoConference: Waiting for %d participants.\n", controller.getCount());
    }

    @Override
    public void run() {
        System.out.printf("VideoConference: Initialization: %d participants.\n", controller.getCount());
        try {
            controller.await();
            System.out.println("VideoConference: All the participants have come");
            System.out.println("VideoConference: Let's start...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package ru.git.a10_additional_information.a10_3_using_a_blocking_thread_safe_queue_to_communicate_with_producers_and_consumers;

import java.util.concurrent.LinkedTransferQueue;

public class Producer implements Runnable {
    private LinkedTransferQueue<String> buffer;
    private String name;

    public Producer(String name, LinkedTransferQueue<String> buffer) {
        this.name = name;
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            buffer.put(name + ": Element " + i);
        }
        System.out.printf("Producer: %s: Producer done\n", name);
    }
}

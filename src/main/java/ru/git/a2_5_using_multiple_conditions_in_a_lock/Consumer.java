package ru.git.a2_5_using_multiple_conditions_in_a_lock;

import java.util.Random;

public class Consumer implements Runnable {
    private final Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (buffer.hasPendingLines()) {
            String line = buffer.get();
            processLine(line);
        }
    }
    private void processLine (String line){
        try {
            Random random = new Random();
            Thread.sleep(random.nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

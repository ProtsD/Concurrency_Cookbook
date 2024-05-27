package ru.git.a8_customizing_concurrency_classes.a8_9_implementing_a_transfer_queue_based_on_priorities;

public class Consumer implements Runnable {
    private final MyPriorityTransferQueue<Event> buffer;

    public Consumer(MyPriorityTransferQueue<Event> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1002; i++) {
            try {
                Event value = buffer.take();
                System.out.printf("Consumer: %s: %d\n", value.getThread(), value.getPriority());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

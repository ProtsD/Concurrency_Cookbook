package ru.git.a7_concurrent_collections.a7_2_using_blocking_thread_safe_deques;

import java.util.Date;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        LinkedBlockingDeque<String> list = new LinkedBlockingDeque<>(3);
        Client client = new Client(list);
        Thread thread = new Thread(client);
        thread.start();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                String request = list.take();
                System.out.printf("Main: Removed: %s at %s. Size: %d\n", request, new Date(), list.size());
            }
            TimeUnit.MILLISECONDS.sleep(300);
        }
        System.out.printf("Main: End of the program.\n");
    }
}

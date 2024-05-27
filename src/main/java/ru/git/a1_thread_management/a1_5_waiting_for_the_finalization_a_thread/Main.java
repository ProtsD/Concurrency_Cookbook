package ru.git.a1_thread_management.a1_5_waiting_for_the_finalization_a_thread;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        DataSourcesLoader dsLoader = new DataSourcesLoader();
        Thread thread1 = new Thread(dsLoader, "DataSourceThread");
        NetworkConnectionsLoader ncLoader = new NetworkConnectionsLoader();
        Thread thread2 = new Thread(ncLoader, "NetworkConnectionLoader");
        thread1.start();
        thread2.start();
        try {
//            thread1.join(2000);
            thread1.join();
            System.out.println("//////////////////" + thread1.getState());
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Main: Configuration has been loaded: %s\n", new Date());

    }
}

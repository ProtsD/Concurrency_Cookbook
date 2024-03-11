package ru.git.a1_5_waiting_for_the_finalization_a_thread;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DataSourcesLoader implements Runnable {
    @Override
    public void run() {
        System.out.printf("Beginning data sources loading: %s\n", new Date());
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Data sources loading has finished: %s\n", new Date());
    }
}

package ru.git.a2_basic_thread_synchronization.a2_4_synchronizing_data_access_with_read_write_locks;

import java.util.Date;

public class Reader implements Runnable {
    private PricesInfo pricesInfo;

    public Reader(PricesInfo pricesInfo) {
        this.pricesInfo = pricesInfo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.printf("%s: %s: Price 1: %f\n", new Date(),
                    Thread.currentThread().getName(),
                    pricesInfo.getPrice1());
            System.out.printf("%s: %s: Price 2: %f\n", new Date(),
                    Thread.currentThread().getName(),
                    pricesInfo.getPrice2());
        }
    }
}

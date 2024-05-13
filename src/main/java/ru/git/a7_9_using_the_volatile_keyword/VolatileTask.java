package ru.git.a7_9_using_the_volatile_keyword;

import java.util.Date;

public class VolatileTask implements Runnable {
    private VolatileFlag flag;

    public VolatileTask(VolatileFlag flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        int i = 0;
        while (flag.flag) {
            i++;
        }
        System.out.printf("VolatileTask: Stopped %d - %s\n", i, new Date());
    }
}

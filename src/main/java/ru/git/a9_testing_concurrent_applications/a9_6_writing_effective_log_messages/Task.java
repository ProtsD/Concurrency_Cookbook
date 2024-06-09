package ru.git.a9_testing_concurrent_applications.a9_6_writing_effective_log_messages;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class Task implements Runnable {
    @Override
    public void run() {
        Logger logger = MyLoggerFactory.getLogger(this.getClass().getName());
        logger.entering(Thread.currentThread().getName(), "run()");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.exiting(Thread.currentThread().getName(), "run()", Thread.currentThread());
    }
}


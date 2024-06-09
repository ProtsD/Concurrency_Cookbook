package ru.git.a9_testing_concurrent_applications.a9_6_writing_effective_log_messages;

import java.io.IOException;
import java.util.logging.*;

public class MyLoggerFactory {
    private static Handler handler;

    public synchronized static Logger getLogger(String name) {
        Logger logger = Logger.getLogger(name);
        logger.setLevel(Level.ALL);
        try {
            if (handler == null) {
                handler = new FileHandler("recipe6.log");
                Formatter format = new MyFormatter();
                handler.setFormatter(format);
            }
            if (logger.getHandlers().length == 0) {
                logger.addHandler(handler);
            }
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
        return logger;
    }
}


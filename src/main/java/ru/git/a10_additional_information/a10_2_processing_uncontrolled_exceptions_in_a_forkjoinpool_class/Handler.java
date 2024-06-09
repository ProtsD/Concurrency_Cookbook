package ru.git.a10_additional_information.a10_2_processing_uncontrolled_exceptions_in_a_forkjoinpool_class;

public class Handler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.printf("Handler: Thread %s has thrown an Exception.\n", t.getName());
        System.out.printf("%s\n", e);
        System.exit(-1);
    }

}

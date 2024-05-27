package ru.git.a8_customizing_concurrency_classes.a8_3_implementing_the_threadfactory_interface_to_generate_custom_threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThreadFactory myFactory = new MyThreadFactory("MyThreadFactory");
        MyTask task = new MyTask();
        Thread thread = myFactory.newThread(task);
        thread.start();
        thread.join();
        System.out.printf("Main: Thread information.\n");
        System.out.printf("%s\n", thread);
        System.out.printf("Main: End of the example.\n");
    }
}

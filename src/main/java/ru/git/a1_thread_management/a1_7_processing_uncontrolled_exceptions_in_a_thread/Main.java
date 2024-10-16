package ru.git.a1_thread_management.a1_7_processing_uncontrolled_exceptions_in_a_thread;

public class Main {
    public static void main(String[] args) {
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.setUncaughtExceptionHandler(new ExceptionHandler());
        thread.start();
    }
}

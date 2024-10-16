package ru.git.a1_thread_management.a1_3_controlling_the_interruption_of_a_thread;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        FileSearch searcher = new FileSearch("C:\\Windows", "WindowsDefenderApplicationGuard.wim");
//        FileSearch searcher = new FileSearch("C:\\Windows","explorer.exe");
        Thread thread = new Thread(searcher);
        thread.start();

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}

package ru.git.a1_thread_management.a1_1_creating_running_and_setting_the_characteristis_of_a_thread;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    int r1;

    public static void main(String[] args) {

        System.out.printf("Minimum Priority: %s ", Thread.MIN_PRIORITY);
        System.out.printf("Normal Priority: %s ", Thread.NORM_PRIORITY);
        System.out.printf("Maximum Priority: %s ", Thread.MAX_PRIORITY);
        System.out.println();


        Thread[] threads;
        Thread.State[] status;
        threads = new Thread[20];
        status = new Thread.State[20];
        for (int i = 0; i < 20; i++) {
            threads[i] = new Thread(new Calculator());
            if ((i % 2) == 0) {
                threads[i].setPriority(Thread.MAX_PRIORITY);
            } else {
                threads[i].setPriority(Thread.MIN_PRIORITY);
            }
            threads[i].setName("My Thread " + i);
        }

        try (FileWriter file = new FileWriter(".\\data\\log.txt");
             PrintWriter pw = new PrintWriter(file)) {

            for (int i = 0; i < 20; i++) {
                pw.println("Main : Status of Thread " + i + " : " + threads[i].getState());
                status[i] = threads[i].getState();
            }
            for (int i = 0; i < 20; i++) {
                threads[i].start();
            }

            boolean finish = false;

            while (!finish) {
                for (int i = 0; i < 20; i++) {
                    if (threads[i].getState() != status[i]) {
                        writeThreadInfo(pw, threads[i], status[i]);
                        status[i] = threads[i].getState();
                    }
                }

                finish = true;
                for (int i = 0; i < 20; i++) {
                    finish = finish && (threads[i].getState() == Thread.State.TERMINATED);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeThreadInfo(PrintWriter pw,
                                        Thread thread,
                                        Thread.State state) {
        pw.printf("Main : Id %d - %s\n", thread.getId(), thread.getName());
        pw.printf("Main : Priority: %d\n", thread.getPriority());
        pw.printf("Main : Old State: %s\n", state);
        pw.printf("Main : New State: %s\n", thread.getState());
        pw.printf("Main : ************************************\n");

    }
}

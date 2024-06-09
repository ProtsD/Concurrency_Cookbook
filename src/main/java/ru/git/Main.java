package ru.git;

public class Main {
    public static void main(String[] args) {


        String s = "Concurrent Programming Design";
        System.out.println("a11_" + s.toLowerCase().replace(" ", "_"));

        s = "Using immutable objects when possible";
        System.out.println("a11_1_" + s.toLowerCase().replace(" ", "_"));

        s = "Avoiding deadlocks by ordering locks";
        System.out.println("a11_2_" + s.toLowerCase().replace(" ", "_"));

        s = "Using atomic variables instead of synchronization";
        System.out.println("a11_3_" + s.toLowerCase().replace(" ", "_"));

        s = "Holding locks for as short time as possible";
        System.out.println("a11_4_" + s.toLowerCase().replace(" ", "_"));

        s = "Delegating the management of threads to executors";
        System.out.println("a11_5_" + s.toLowerCase().replace(" ", "_"));

        s = "Using concurrent data structures instead of programming yourselves";
        System.out.println("a11_6_" + s.toLowerCase().replace(" ", "_"));

        s = "Taking precautions using lazy initialization";
        System.out.println("a11_7_" + s.toLowerCase().replace(" ", "_"));

        s = "Using the fork_join framework instead of executors";
        System.out.println("a11_8_" + s.toLowerCase().replace(" ", "_"));

        s = "Avoiding the use of blocking operations inside a lock";
        System.out.println("a11_9_" + s.toLowerCase().replace(" ", "_"));

        s = "Avoiding the use of deprecated methods";
        System.out.println("a11_10_" + s.toLowerCase().replace(" ", "_"));

        s = "Using executors instead of thread groups";
        System.out.println("a11_11_" + s.toLowerCase().replace(" ", "_"));

        s = "Using streams to process big data sets";
        System.out.println("a11_12_" + s.toLowerCase().replace(" ", "_"));

        s = "Other tips and tricks";
        System.out.println("a11_13_" + s.toLowerCase().replace(" ", "_"));
    }
}

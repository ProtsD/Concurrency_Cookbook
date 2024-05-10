package ru.git;

public class Main {
    public static void main(String[] args) {
        String s = "Using non-blocking thread-safe deques";
        System.out.println("a7_1_" + s.toLowerCase().replace(" ", "_"));

        s = "Using blocking thread-safe deques";
        System.out.println("a7_2_" + s.toLowerCase().replace(" ", "_"));

        s = "Using blocking thread-safe queue ordered by priority";
        System.out.println("a7_3_" + s.toLowerCase().replace(" ", "_"));

        s = "Using thread-safe lists with delayed elements";
        System.out.println("a7_4_" + s.toLowerCase().replace(" ", "_"));

        s = "Using thread-safe navigable maps";
        System.out.println("a7_5_" + s.toLowerCase().replace(" ", "_"));

        s = "Using thread-safe HashMaps";
        System.out.println("a7_6_" + s.toLowerCase().replace(" ", "_"));

        s = "Using atomic variables";
        System.out.println("a7_7_" + s.toLowerCase().replace(" ", "_"));

        s = "Using atomic arrays";
        System.out.println("a7_8_" + s.toLowerCase().replace(" ", "_"));

        s = "Using the volatile keyword";
        System.out.println("a7_9_" + s.toLowerCase().replace(" ", "_"));

        s = "Using variable handles";
        System.out.println("a7_10_" + s.toLowerCase().replace(" ", "_"));
    }
}

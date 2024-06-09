package ru.git.a9_testing_concurrent_applications.a9_10_testing_concurrency_code_with_multithreadedtc;

import edu.umd.cs.mtc.TestFramework;

public class Main {
    public static void main(String[] args) throws Throwable {
        ProducerConsumerTest test = new ProducerConsumerTest();
        System.out.printf("Main: Starting the test\n");
        TestFramework.runOnce(test);
        System.out.printf("Main: The test has finished\n");
    }
}

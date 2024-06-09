package ru.git.a10_additional_information.a10_2_processing_uncontrolled_exceptions_in_a_forkjoinpool_class;

import java.util.concurrent.RecursiveAction;
import java.util.concurrent.TimeUnit;

public class OneSecondLongTask extends RecursiveAction {
    @Override
    protected void compute() {
        System.out.printf("Task: Starting.\n");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Task: Finish.\n");
    }
}

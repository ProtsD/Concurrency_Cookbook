package ru.git.a10_additional_information.a10_2_processing_uncontrolled_exceptions_in_a_forkjoinpool_class;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinWorkerThread;

public class AlwaysThrowsExceptionWorkerThread extends ForkJoinWorkerThread {
    protected AlwaysThrowsExceptionWorkerThread(ForkJoinPool pool) {
        super(pool);
    }

    protected void onStart() {
        super.onStart();
        throw new RuntimeException("Exception from worker thread");
    }
}

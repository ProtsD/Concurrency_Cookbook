package ru.git.a10_additional_information.a10_2_processing_uncontrolled_exceptions_in_a_forkjoinpool_class;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinWorkerThread;

public class AlwaysThrowsExceptionWorkerThreadFactory implements ForkJoinPool.ForkJoinWorkerThreadFactory {
    @Override
    public ForkJoinWorkerThread newThread(ForkJoinPool pool) {
        return new AlwaysThrowsExceptionWorkerThread(pool);
    }
}

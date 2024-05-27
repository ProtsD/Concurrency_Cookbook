package ru.git.a8_customizing_concurrency_classes.a8_12_implementing_your_own_asynchronous_stream;

import java.util.concurrent.Flow;

public class MySubscription implements Flow.Subscription {
    private boolean canceled = false;
    private long requested = 0;

    @Override
    public void cancel() {
        canceled = true;
    }

    @Override
    public void request(long value) {
        requested += value;
    }

    public boolean isCanceled() {
        return canceled;
    }

    public long getRequested() {
        return requested;
    }

    public void decreaseRequested() {
        requested--;
    }
}

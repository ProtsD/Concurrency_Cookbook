package ru.git.a8_customizing_concurrency_classes.a8_12_implementing_your_own_asynchronous_stream;

public class ConsumerData {
    private Consumer consumer;
    private MySubscription subscription;

    public Consumer getConsumer() {
        return consumer;
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    public MySubscription getSubscription() {
        return subscription;
    }

    public void setSubscription(MySubscription subscription) {
        this.subscription = subscription;
    }
}

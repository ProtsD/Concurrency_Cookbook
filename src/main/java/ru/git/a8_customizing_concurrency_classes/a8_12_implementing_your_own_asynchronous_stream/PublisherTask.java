package ru.git.a8_customizing_concurrency_classes.a8_12_implementing_your_own_asynchronous_stream;

public class PublisherTask implements Runnable {
    private ConsumerData consumerData;
    private News news;

    public PublisherTask(ConsumerData consumerData, News news) {
        this.consumerData = consumerData;
        this.news = news;
    }
    @Override
    public void run() {
        MySubscription subscription = consumerData.getSubscription();
        if (!(subscription.isCanceled() && (subscription.getRequested()
                > 0))) {
            consumerData.getConsumer().onNext(news);
            subscription.decreaseRequested();
        }
    }
}

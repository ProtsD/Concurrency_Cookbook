package ru.git.a8_customizing_concurrency_classes.a8_10_implementing_your_own_atomic_object;

public class Sensor2 implements Runnable {
    private ParkingCounter counter;

    public Sensor2(ParkingCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.carIn();
        counter.carOut();
        counter.carOut();
        counter.carIn();
        counter.carIn();
        counter.carIn();
        counter.carIn();
        counter.carIn();
        counter.carIn();
    }
}

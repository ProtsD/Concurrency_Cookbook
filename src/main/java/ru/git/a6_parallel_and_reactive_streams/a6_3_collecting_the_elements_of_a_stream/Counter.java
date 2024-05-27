package ru.git.a6_parallel_and_reactive_streams.a6_3_collecting_the_elements_of_a_stream;

public class Counter {
    private String value;
    private int counter;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void increment() {
        counter += counter;
    }

}

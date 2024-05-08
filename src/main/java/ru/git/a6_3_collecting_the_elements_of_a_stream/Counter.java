package ru.git.a6_3_collecting_the_elements_of_a_stream;

import ru.git.a2_4_synchronizing_data_access_with_read_write_locks.PricesInfo;

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

package ru.git.a3_3_synchronizing_tasks_in_a_common_point;

public class Results {
    private final int data[];

    public Results(int size) {
        data = new int[size];
    }

    public void setData(int position, int value) {
        data[position] = value;
    }

    public int[] getData() {
        return data;
    }
}

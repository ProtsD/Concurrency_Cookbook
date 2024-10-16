package ru.git.a3_thread_synchronization_utilities.a3_3_synchronizing_tasks_in_a_common_point;

import java.util.Random;

public class MatrixMock {
    private final int[][] data;

    public MatrixMock(int size, int length, int number) {
        int counter = 0;
        data = new int[size][length];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < length; j++) {
                data[i][j] = random.nextInt(10);
                if (data[i][j] == number) {
                    counter++;
                }
            }
        }
        System.out.printf("Mock: There are %d occurrences of number %d in generated data.\n", counter, number);
    }

    public int[] getRow(int row) {
        if ((row >= 0) && (row < data.length)) {
            return data[row];
        }
        return null;
    }
}

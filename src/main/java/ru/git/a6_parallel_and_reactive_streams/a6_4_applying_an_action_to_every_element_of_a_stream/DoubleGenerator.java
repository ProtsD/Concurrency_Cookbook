package ru.git.a6_parallel_and_reactive_streams.a6_4_applying_an_action_to_every_element_of_a_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;

public class DoubleGenerator {

    public static List<Double> generateDoubleList(int size, int max) {
        Random random = new Random();
        List<Double> numbers = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            double value = random.nextDouble() * max;
            numbers.add(value);
        }
        return numbers;
    }

    public static DoubleStream generateStreamFromList(List<Double> list) {
        DoubleStream.Builder builder = DoubleStream.builder();

        for (Double number : list) {
            builder.add(number);
        }
        return builder.build();
    }
}

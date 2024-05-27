package ru.git.a6_parallel_and_reactive_streams.a6_7_sorting_the_elements_of_a_stream;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String args[]) {
        int[] numbers = {9, 8, 7, 6, 5, 4, 3, 2, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        Arrays.stream(numbers).parallel().sorted().forEach
        Arrays.stream(numbers).parallel().sorted().forEachOrdered
                (n -> {
                    System.out.printf("%d\n", n);
                });

        List<Person> persons = PersonGenerator.generatePersonList(10);
        persons.parallelStream().sorted().forEachOrdered(p -> {
            System.out.printf("%s, %s\n", p.getLastName(), p.getFirstName());
        });
        System.out.println("************************");

        TreeSet<Person> personSet = new TreeSet<>(persons);
        for (int i = 0; i < 10; i++) {
            Person person = personSet.stream().parallel().limit(1)
                    .collect(Collectors.toList()).get(0);
            System.out.printf("%s %s\n", person.getFirstName(), person.getLastName());

            person = personSet.stream().unordered().parallel().limit(1)
                    .collect(Collectors.toList()).get(0);
            System.out.printf("%s %s\n", person.getFirstName(), person.getLastName());
            System.out.println("++++++++++++++++++++++++");
        }
    }
}
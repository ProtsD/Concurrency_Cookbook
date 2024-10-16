package ru.git.a6_parallel_and_reactive_streams.a6_2_reducing_the_elements_of_a_stream;

import ru.git.a6_parallel_and_reactive_streams.a6_1_creating_streams_from_different_sources.Person;
import ru.git.a6_parallel_and_reactive_streams.a6_1_creating_streams_from_different_sources.PersonGenerator;

import java.util.List;
import java.util.Optional;
import java.util.stream.DoubleStream;

public class Main {
    public static void main(String args[]) {

        List<Double> numbers = DoubleGenerator.generateDoubleList(10000, 1000);
        DoubleStream doubleStream = DoubleGenerator.generateStreamFromList(numbers);
        long numberOfElements = doubleStream.parallel().count();
        System.out.printf("The list of numbers has %d elements.\n", numberOfElements);

        doubleStream = DoubleGenerator.generateStreamFromList(numbers);
        double sum = doubleStream.parallel().sum();
        System.out.printf("Its numbers sum %f.\n", sum);

        doubleStream = DoubleGenerator.generateStreamFromList(numbers);
        double average = doubleStream.parallel()
                .average()
                .getAsDouble();
        System.out.printf("Its numbers have an average value of %f.\n", average);

        doubleStream = DoubleGenerator.generateStreamFromList(numbers);
        double max = doubleStream.parallel()
                .max()
                .getAsDouble();
        System.out.printf("The maximum value in the list is %f.\n", max);

        doubleStream = DoubleGenerator.generateStreamFromList(numbers);
        double min = doubleStream.parallel()
                .min()
                .getAsDouble();
        System.out.printf("The minimum value in the list is %f.\n", min);

        System.out.printf("Reduce, first version\n");
        List<Point> points = PointGenerator.generatePointList(10000);
        Optional<Point> point = points.parallelStream().reduce((p1, p2) -> {
            Point p = new Point();
            p.setX(p1.getX() + p2.getX());
            p.setY(p1.getY() + p2.getY());
            return p;
        });
        System.out.println(point.get().getX() + ":" + point.get().getY());

        System.out.printf("Reduce, second version\n");
        List<Person> persons = PersonGenerator.generatePersonList(10000);
        long totalSalary = persons.parallelStream().map
                (p -> p.getSalary()).reduce(0, (s1, s2) -> s1 + s2);
        long totalSalary2 = persons.parallelStream().mapToLong(Person::getSalary).sum();
        System.out.printf("Total salary1: %d\n", totalSalary);
        System.out.printf("Total salary2: %d\n", totalSalary);

        System.out.printf("Reduce, third version\n");
        Integer value = 0;
        value = persons.parallelStream().reduce(value, (n, p) -> {
            if (p.getSalary() > 50000) {
                return n;
            } else {
                return n;
            }
        }, (n1, n2) -> n1 + n2);
        Long value2 = persons.parallelStream().mapToInt(Person::getSalary).filter(n -> n > 50000).count();
        System.out.printf("The number of people with a salary bigger that 50,000 is %d\n", value);
        System.out.printf("The number of people with a salary bigger that 50,000 is %d\n", value2);
    }
}

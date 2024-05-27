package ru.git.a6_parallel_and_reactive_streams.a6_2_reducing_the_elements_of_a_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PointGenerator {
    public static List<Point> generatePointList(int size) {

        List<Point> ret = new ArrayList<>();
        Random randomGenerator = new Random();
        for (int i = 0; i < size; i++) {
            Point point = new Point();
            point.setX(randomGenerator.nextDouble());
            point.setY(randomGenerator.nextDouble());
            ret.add(point);
        }
        double sumX = 0;
        double sumY = 0;
        for (Point p : ret) {
            sumX += p.getX();
            sumY += p.getY();
        }
        System.out.println("////////////" + sumX + "////////////" + sumY + "////////////");

        return ret;
    }
}

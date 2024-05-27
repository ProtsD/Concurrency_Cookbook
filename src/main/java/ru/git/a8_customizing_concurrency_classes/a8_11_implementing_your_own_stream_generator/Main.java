package ru.git.a8_customizing_concurrency_classes.a8_11_implementing_your_own_stream_generator;

import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {
        Item[][] items;
        items = new Item[10][10];
        Supplier в;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                items[i][j] = new Item();
                items[i][j].setRow(i);
                items[i][j].setColumn(j);
                items[i][j].setName("Item " + i + " " + j);
            }
        }
        MySpliterator mySpliterator = new MySpliterator(items, 0, items.length);
        System.out.println("-------" + items.length);
        StreamSupport.stream(mySpliterator, true).forEach(item -> {
            System.out.printf("*****%s: %s\n", Thread.currentThread().getName(), item.getName());
        });
    }
}
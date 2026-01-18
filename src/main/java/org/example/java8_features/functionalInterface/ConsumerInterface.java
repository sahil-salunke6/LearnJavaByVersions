package org.example.java8_features.functionalInterface;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {

    public static void main(String[] args) {

        Consumer<Integer> consume = i -> System.out.println("Consumed value: " + i);
        consume.accept(10);


        // Consumer using andThen

        Consumer<List<Integer>> consumer1 = list -> {
            for (Integer i : list) {
                System.out.println(i + 100);
            }
        };

        Consumer<List<Integer>> consumer2 = list -> {
            for (Integer i : list) {
                System.out.println(i);
            }
        };

        Consumer<List<Integer>> combinedConsumer = consumer2.andThen(consumer1);
        combinedConsumer.accept(List.of(1, 2, 3, 4, 5));

    }

}

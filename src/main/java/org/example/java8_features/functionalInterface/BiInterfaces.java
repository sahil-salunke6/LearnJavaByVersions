package org.example.java8_features.functionalInterface;

import java.util.function.*;

public class BiInterfaces {

    public static void main(String[] args) {

        System.out.println("------------------------- BiPredicate Interface ----------------------------");

        // When we have single input parameter, we can use Predicate
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));

        // When we have two input parameters, we can use BiPredicate
        BiPredicate<Integer, Integer> isSumGreaterThanTen = (a, b) -> (a + b) > 10;
        System.out.println("Is sum of 6 and 5 greater than 10? " + isSumGreaterThanTen.test(6, 5));

        System.out.println("------------------------- BiFunction Interface ----------------------------");

        Function<String, Integer> stringLength = str -> str.length();
        System.out.println("Length of 'Hello': " + stringLength.apply("Hello"));

        BiFunction<String, String, Integer> combinedLength = (str1, str2) -> str1.length() + str2.length();
        System.out.println("Combined length of 'Hello' and 'World': " + combinedLength.apply("Hello", "World"));


        System.out.println("------------------------- BiConsumer Interface ----------------------------");

        Consumer<String> printString = str -> System.out.println("Single input: " + str);
        printString.accept("Hello");

        BiConsumer<String, String> printTwoStrings = (str1, str2) ->
                System.out.println("Two inputs: " + str1 + ", " + str2);
        printTwoStrings.accept("Hello", "World");

    }

}

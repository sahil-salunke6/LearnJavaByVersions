package org.example.java8_features.lambdaExpression.comparitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorUsingLambdaExpression {

    public static void main(String[] args) {

        /**
         * Normal implementation
         */
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(4);
        System.out.println("Original List: " + numbers);

        // Ascending order using normal comparator
        Collections.sort(numbers);
        System.out.println("Sorted List using Normal Comparator: " + numbers);

        // Descending order using normal comparator
        Collections.sort(numbers, new Compare());
        System.out.println("Sorted List in Descending order using Normal Comparator: " + numbers);


        /**
         * Using Lambda Expression
         */

        System.out.println("\n----------- Using Lambda Expression -----------");

        // Ascending order using lambda expression
        Collections.sort(numbers, (a, b) -> a - b);
        System.out.println("Sorted List using Lambda Expression: " + numbers);

        // Descending order using lambda expression
        Collections.sort(numbers, (a, b) -> b - a);
        System.out.println("Sorted List in Descending order using Lambda Expression: " + numbers);

    }
}

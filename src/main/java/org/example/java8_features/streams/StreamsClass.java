package org.example.java8_features.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsClass {

    public static void main(String[] args) {

        /*
          Generate stream from existing collection using Collection.stream()
         */

        // Convert given list of numbers to stream using stream().toList()

        List<Integer> numbers = List.of(1, 2, 3, 4, 225, 5, 6, 7, 315, 8, 9, 710, 10);

        List<Integer> list = numbers.stream().toList();// collect() to gather the final results as a list
        System.out.println("Original List: " + list);

        // Convert given Array to stream using Arrays.stream()

        String[] stringArray = {"Java", "Python", "C++", "JavaScript", "Ruby"};

        Object[] stringStream = Stream.of(stringArray).toArray();
        System.out.println("String Array Stream: " + List.of(stringStream));


        // ----------------------------------------------------------------------


        /*
          Generate stream from scratch using Stream.iterate()
          Demonstrating various Stream operations: iterate, peek, filter, map, and collect
         */

        Stream.iterate(0, x -> x + 1).limit(21)                        // iterate() to create a stream of numbers from 0 to 20
                .peek(x -> System.out.println("Generated: " + x))                   // peek() to log the generated numbers
                .filter(x -> x % 2 == 0)                                            // filter() to check condition and retain only even numbers
                .peek(x -> System.out.println("Even: " + x))
                .map(x -> x * x)                                                    // map() to perform some logic and transform each number to its square
                .peek(x -> System.out.println("Squared: " + x))
                .toList()                                                           // collect() to gather the final results as a list
                .stream().peek(x -> System.out.println("Final Output: " + x));


        // -------------------------------Perform stream operation with list of objects ---------------------------------------

        List<TestEmployee> employees = List.of(
                new TestEmployee(1, "Alice", 70000, "HR", 30),
                new TestEmployee(2, "Bob", 80000, "Finance", 35),
                new TestEmployee(3, "Charlie", 90000, "IT", 28),
                new TestEmployee(4, "David", 60000, "Marketing", 40),
                new TestEmployee(5, "Eve", 75000, "IT", 32),
                new TestEmployee(6, "Frank", 85000, "Finance", 29),
                new TestEmployee(7, "Grace", 95000, "HR", 45),
                new TestEmployee(8, "Hannah", 72000, "IT", 27),
                new TestEmployee(9, "Ian", 68000, "Marketing", 38),
                new TestEmployee(10, "Jack", 80000, "Finance", 31)
        );

        // Find average age of employees in each department

        Map<String, Double> averageAgeByDepartment = employees.stream()
                .collect(Collectors.groupingBy(TestEmployee::getDepartment, Collectors.averagingInt(TestEmployee::getAge)));

        System.out.println("Average age of employees in each department: " + averageAgeByDepartment);


    }

}

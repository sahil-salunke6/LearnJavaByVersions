package org.example.java8_features.functionalInterface;

import org.example.java8_features.lambdaExpression.comparitor.TestPojo;

import java.util.List;
import java.util.function.Function;

/**
 * Function<T, R>
 * Represents a function that accepts one argument and produces a result.
 * This is a functional interface whose functional method is apply(Object).
 */
public class FunctionInterface {

    public static void main(String[] args) {

        Function<String, Integer> getLength = name -> name.length();
        Function<String, String> getFirstThreeChar = name -> name.substring(0, 3);

        // Using apply method
        System.out.println("Length of 'Functional': " + getLength.apply("Functional"));
        System.out.println("First three characters of 'Interface': " + getFirstThreeChar.apply("Interface"));

        // Function composition using andThen
        Function<String, Integer> lengthAfterFirstThreeChar =
                getFirstThreeChar.andThen(getLength);

        System.out.println("Length of first three characters of 'Composition': " +
                lengthAfterFirstThreeChar.apply("Composition"));


        //  Function composition using compose
        Function<String, String> firstThreeCharAfterLength =
                getFirstThreeChar.compose(t -> getLength.toString());

        System.out.println("First three characters after length of 'Compose': " +
                firstThreeCharAfterLength.apply("Compose"));

        // Using Pojo class with Function interface

        TestPojo emp1 = new TestPojo(1, "Ram Kumar");
        TestPojo emp2 = new TestPojo(2, "Shyam Lal");
        TestPojo emp3 = new TestPojo(3, "Ramesh Singh");

        Function<List<TestPojo>, List<TestPojo>> employeeWithRamPrefix = testPojo -> {

            List<TestPojo> result = new java.util.ArrayList<>();

            for (TestPojo pojo : testPojo) {
                if (getFirstThreeChar.apply(pojo.name).equalsIgnoreCase("Ram")) {
                    result.add(pojo);
                }
            }
            return result;
        };

        System.out.println("Employees with 'Ram' prefix: " + employeeWithRamPrefix.apply(List.of(emp1, emp2, emp3)));

    }

}

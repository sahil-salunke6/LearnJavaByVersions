package org.example.java8_features.functionalInterface;

import org.example.java8_features.lambdaExpression.comparitor.TestPojo;

import java.util.function.Predicate;

/**
 * This class demonstrates the usage of Java 8 Predicate functional interface.
 * It includes examples of creating predicates, testing them, and combining them
 * using logical operations like AND, OR, and NOT.
 */
public class Predicates {

    public static void main(String[] args) {

        Predicate<Integer> isEven = number -> number % 2 == 0;
        Predicate<Integer> isGreaterThanTen = number -> number > 10;


        // Testing individual predicates with abstract method 'test'
        System.out.println("Is 4 even? " + isEven.test(4));
        System.out.println("Is 7 even? " + isEven.test(7));
        System.out.println("Is 15 greater than 10? " + isGreaterThanTen.test(15));
        System.out.println("Is 8 greater than 10? " + isGreaterThanTen.test(8));


        // Combining predicates using 'and' and 'or' methods

        System.out.println("\nUsing AND operation:" +
                " Is 12 even and greater than 10? " + isEven.and(isGreaterThanTen).test(12));

        System.out.println("Is 9 even and greater than 10? " + isEven.and(isGreaterThanTen).test(9));

        System.out.println("\nUsing OR operation:" +
                " Is 8 even or greater than 10? " + isEven.or(isGreaterThanTen).test(8));

        System.out.println("Is 11 even or greater than 10? " + isEven.or(isGreaterThanTen).test(11));

        // Using 'negate' method

        System.out.println("\nUsing NEGATE operation:" +
                " Is 5 not even? " + isEven.negate().test(5));

        System.out.println("Is 10 not greater than 10? " + isGreaterThanTen.negate().test(10));

        // Using 'isEqual' static method

        Predicate<String> isHello = Predicate.isEqual("Hello");

        System.out.println("\nUsing isEqual static method:" +
                " Is 'Hello' equal to 'Hello'? " + isHello.test("Hello"));

        System.out.println("Is 'World' equal to 'Hello'? " + isHello.test("World"));

        // Using 'not' static method (Java 11 and above)

        Predicate<Integer> isOdd = Predicate.not(isEven);

        System.out.println("\nUsing not static method:" +
                " Is 7 odd? " + isOdd.test(7));

        System.out.println("Is 10 odd? " + isOdd.test(10));


        /**
         * Used with Pojo class
         */

        TestPojo person1 = new TestPojo(25, "John");
        TestPojo person2 = new TestPojo(15, "Alice");

        Predicate<TestPojo> isAdult = person -> person.id > 18;
        Predicate<TestPojo> isNameJohn = person -> "John".equals(person.name);

        System.out.println("\nIs person1 an adult? " + isAdult.test(person1));

        System.out.println("Is person2 named John? " + isNameJohn.test(person2));

    }

}

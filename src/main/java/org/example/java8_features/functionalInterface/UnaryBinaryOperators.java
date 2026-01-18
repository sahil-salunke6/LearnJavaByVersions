package org.example.java8_features.functionalInterface;


import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryBinaryOperators {

    public static void main(String[] args) {

        System.out.println("------------------------- Unary Operator ----------------------------");

        Function<Integer, Integer> squareFunction = x -> x * x;
        System.out.println("Square of 5: " + squareFunction.apply(5));

        UnaryOperator<Integer> squareUnaryOperator = x -> x * x;
        System.out.println("Square of 6 using UnaryOperator: " + squareUnaryOperator.apply(6));

        System.out.println("------------------------- Binary Operator ----------------------------");

        BiFunction<Integer, Integer, Integer> addFunction = (a, b) -> a + b;
        System.out.println("Sum of 4 and 5: " + addFunction.apply(4, 5));

        BinaryOperator<Integer> addBinaryOperator = (a, b) -> a + b;
        System.out.println("Sum of 7 and 8 using BinaryOperator: " + addBinaryOperator.apply(7, 8));
    }

}

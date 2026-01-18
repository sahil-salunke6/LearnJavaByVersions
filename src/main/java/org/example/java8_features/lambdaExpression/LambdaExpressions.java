package org.example.java8_features.lambdaExpression;

/**
 * This class demonstrates How to convert normal function to lambda expressions in Java.
 */
public class LambdaExpressions {

    /**
     * 1st example: Single parameter, No return type
     */

    private void printString(String s) {
        System.out.println(s);
    }

    // Remove Modifier, Return Type, and Method Name = Lambda Expression

    //////    (String s) -> {System.out.println(s);}

    // Can improvise further by removing data type and curly braces

    //////    s -> System.out.println(s);


    /**
     * 2nd example: Multiple parameters, With return type
     */

    private int addNumbers(int a, int b) {
        return a + b;
    }

    // Remove Modifier, Return Type, and Method Name = Lambda Expression

    //////    (int a, int b) -> { return a + b; }

    // Can improvise further by removing data types, curly braces, and return keyword

    //////    (a, b) -> a + b;

    // As here we have multiple parameters, we need to keep the parentheses.

}

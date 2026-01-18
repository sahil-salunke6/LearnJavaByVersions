package org.example.java8_features.functionalInterface;

/**
 * An interface with single abstract method is called as Functional Interface in Java.
 * It can have any number of default or static methods.
 *
 * @FunctionalInterface annotation is used to indicate that the interface is intended to be a functional interface.
 * If the interface annotated with @FunctionalInterface contains more than one abstract method, the compiler will
 * generate an error.
 * This feature is primarily used in lambda expressions and method references.
 */
public interface FunctionalInterface {

    // Single abstract method (abstract means without body)
    void execute();


    ////// You can add any number of default or static methods if needed

    default void defaultMethod() {
        System.out.println("This is a default method in the functional interface.");
    }

    static void staticMethod() {
        System.out.println("This is a static method in the functional interface.");
    }
}

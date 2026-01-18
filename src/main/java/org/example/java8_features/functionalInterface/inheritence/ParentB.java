package org.example.java8_features.functionalInterface.inheritence;

public interface ParentB {

    // Single abstract method
    void display();

    // Default method
    default void defaultMethod() {
        System.out.println("This is a default method in Parent B interface.");
    }

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method in Parent B interface.");
    }
}

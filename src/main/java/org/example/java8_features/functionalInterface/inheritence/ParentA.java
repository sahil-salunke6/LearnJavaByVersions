package org.example.java8_features.functionalInterface.inheritence;

public interface ParentA {

    // Single abstract method
    void show();

    // Default method
    default void defaultMethod() {
        System.out.println("This is a default method in Parent A interface.");
    }

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method in Parent A interface.");
    }

}

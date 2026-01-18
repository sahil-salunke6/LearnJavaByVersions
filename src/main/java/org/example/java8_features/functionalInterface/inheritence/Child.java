package org.example.java8_features.functionalInterface.inheritence;

@FunctionalInterface
public interface Child extends Parent {
}


// As Child interface extends Parent interface, it inherits the single abstract method show() from Parent.
// Therefore, Child interface is also a functional interface because it has only one abstract method (inherited from Parent).

// You can also add default or static methods in Child interface if needed, but you cannot add another abstract method.

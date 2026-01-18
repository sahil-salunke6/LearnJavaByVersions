package org.example.java8_features.functionalInterface.inheritence;

public class ChildClass implements ParentA, ParentB {

    /**
     * Abstract methods will get override compulsory
     */
    @Override
    public void show() {

    }

    @Override
    public void display() {

    }
    //----------------------------------------------

    /**
     * Default methods will create ambiguity if both parent interfaces have same method signature
     * So we need to override the default method to resolve the ambiguity
     * If we don't override the default method, it will throw a compile time error
     * ----------------------------------------------------------------------------
     * If both parent interfaces have different default method signatures, then no need to override
     * we can directly use the default methods from parent interfaces
     */

    @Override
    public void defaultMethod() {
        ParentA.super.defaultMethod();
        ParentB.super.defaultMethod();
    }
    //----------------------------------------------

    /**
     * Static methods can be accessed using interface name
     * No need to override static methods in child class
     * ------------------------------------------------
     * If both parent interfaces have same static method signatures, then no ambiguity will be created
     * We can access the static methods using interface name
     * ------------------------------------------------
     * Static methods are not inherited by the child class
     * ------------------------------------------------
     * We can access static methods using interface name
     * ------------------------------------------------
     */

    public static void main(String[] a) {
        // Accessing static methods using interface name
        ParentA.staticMethod();
        ParentB.staticMethod();
    }

}

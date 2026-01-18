package org.example.java8_features;

import java.util.List;

public class MethodConstructorReference {

    private void printMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        MethodConstructorReference reference = new MethodConstructorReference();

        List<String> messages = List.of("Hello", "World", "from", "Lambda", "Expressions");

        // Using Lambda Expression
        messages.forEach(msg -> reference.printMessage(msg));
        // Or
        messages.forEach(message -> System.out.println(message));


        // Using Method Reference
        messages.forEach(reference::printMessage);
    }

}

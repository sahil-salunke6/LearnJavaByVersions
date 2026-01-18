package org.example.java8_features.lambdaExpression.comparitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class CompareObjects {

    public static void main(String[] a) {
        TestPojo obj1 = new TestPojo(1, "John");
        TestPojo obj2 = new TestPojo(2, "Alice");
        TestPojo obj3 = new TestPojo(3, "Bob");

        List<TestPojo> people = new ArrayList<>();
        people.add(obj1);
        people.add(obj2);
        people.add(obj3);

        System.out.println("Original List:" + people);

        // Sort by id descending
        Collections.sort(people, (p1, p2) -> p2.id - p1.id);
        System.out.println("Descending sorted List:" + people);

        // Sort by name ascending
        Collections.sort(people, (p1, p2) -> p1.name.compareTo(p2.name));
        System.out.println("Ascending sorted List:" + people);

        // Sort by name descending
        Collections.sort(people, (p1, p2) -> p2.name.compareTo(p1.name));
        System.out.println("Descending sorted List by name:" + people);


    }

}

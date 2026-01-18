package org.example.java8_features.streams;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TestEmployee {
    private int id;
    private String name;
    private double salary;
    private String department;
    private int age;
}

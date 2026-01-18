package org.example.java8_features.streams;

public class TestEmployee {
    private int id;
    private String name;
    private double salary;
    private String department;
    private int age;

    public TestEmployee(int id, String name, double salary, String department, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.age = age;
    }

    @Override
    public String toString() {
        return "TestEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", age=" + age +
                '}';
    }
}

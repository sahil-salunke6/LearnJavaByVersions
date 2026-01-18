package org.example.java8_features.lambdaExpression.comparitor;

public class TestPojo {

    public TestPojo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int id;
    public String name;

    @Override
    public String toString() {
        return "TestPojo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

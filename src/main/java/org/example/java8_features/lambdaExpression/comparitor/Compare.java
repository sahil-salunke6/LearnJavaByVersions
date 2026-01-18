package org.example.java8_features.lambdaExpression.comparitor;

import java.util.Comparator;

public class Compare implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        return b - a;
    }
}

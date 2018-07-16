package com.higgsup.java.stream;

import java.util.function.Predicate;

public class TestPredicate {
    public static void main(String[] args) {
        testIsEqual();
    }

    private static void testIsEqual() {
        Predicate<String> i  = Predicate.isEqual("asdf");

        System.out.println(i.test("java2s.com "));
    }
}

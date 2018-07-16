package com.higgsup.java.stream;

import java.util.function.Function;

public class TestFunction {
    public static void main(String[] args) {
        testCompareComposeAndThen();
    }

    private static void testCompareComposeAndThen() {
        Function<Integer, Integer> times2 = e -> {
            System.out.println("time 2");
            return e * 2;
        };
        Function<Integer, Integer> squared = e -> {
            System.out.println("squared ");
            return e * e;
        };
        Function<Integer, Integer> squared1 = e -> {
            System.out.println("squared 1");
            return e * 3;
        };
        Integer result = times2
                .compose(squared)
                .compose(squared1)
                .andThen(squared)
                .apply(4);
        System.out.println("Result " + result);
    }
}

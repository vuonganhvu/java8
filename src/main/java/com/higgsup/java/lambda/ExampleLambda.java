package com.higgsup.java.lambda;

import java.util.function.Predicate;

public class ExampleLambda {
    public static void main(String[] args) {

        // write lambda expression
        Predicate<Integer> predicate = number->number > 100;
        System.out.println("----So sanh 5 voi 100 lambda-----");
        System.out.println(checkCompare(5, predicate));
        System.out.println("----So sanh 115 voi 100 lambda-----");
        System.out.println(checkCompare(115, predicate));
        System.out.println("----So sanh 100 voi 100 lambda-----");
        System.out.println(checkCompare(100, predicate));

        // write full
        System.out.println("----So sanh 5 voi 100 -----");
        System.out.println(checkCompare(5, new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 100;
            }
        }));

        System.out.println("----So sanh 115 voi 100-----");
        System.out.println(checkCompare(115, new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 100;
            }
        }));


        System.out.println("----So sanh 100 voi 100-----");
        System.out.println(checkCompare(100, new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 100;
            }
        }));
    }

    public static boolean checkCompare(Integer source, Predicate<Integer> predicate) {
        return predicate.test(source);
    }
}

package com.higgsup.java;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Hello world!
 *
 */
public class App 
{
    static String name;
    public static void main( String[] args ) {
//        SubStudent subStudent = new SubStudent();
//        ((Student)subStudent.getClass().newInstance()).printStudent();
//        System.out.println( "Hello World!" );
//        List<String> stringList = new ArrayList<>();
//        stringList.replaceAll(String::toUpperCase);
//        stringList.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//
//            }
//        });
//
//        TestClass testClass = new TestClass();
//        Stream<String> stream1 = Stream.generate(() -> {return "abc";});
//        Stream<String> stream2 = Stream.iterate("abc", (i) -> i);
//        stream2.limit(10);
//      Long count =  stream2.count();
//        System.out.println(stream2);
//        stream1.collect(Collectors.toList()).forEach(x-> System.out.println(x));
//        testClass.defaultMethod();
//        ZonedDateTime zonedDateTime =  ZonedDateTime.now();
//        System.out.println(zonedDateTime);


//        List<String> strings = new ArrayList<>();
//        strings.forEach(x-> {
//
//
//        });
//        try {
//            strings.iterator().forEachRemaining(x-> {
//
//            });
//        } catch (Exception e) {
//
//        }

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

package com.higgsup.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;
import java.util.function.Function;

/**
 * Hello world!
 *
 */
public class App 
{
    static String name;
    public static void main( String[] args ) throws ExecutionException, InterruptedException {
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
        Callable<String> callable = () -> {
            System.out.println("Thread name is " + Thread.currentThread().getName());
            return "fdsfds";
        };

        ExecutorService executor = Executors.newFixedThreadPool(5);
        Future<String> future = executor.submit(callable);
        System.out.println("value - "+ future.get());
        executor.shutdown();

    }

}

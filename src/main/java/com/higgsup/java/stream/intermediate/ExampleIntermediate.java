package com.higgsup.java.stream.intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleIntermediate {

    public static void main(String[] args) {
        demoFilter();
        demoFlatMap();
        demoMap();
        demoSorted();
    }

    private static void demoFilter() {
        System.out.println("\n--------demoFilter--------");
        List<Integer> myList = new ArrayList<>();
        for(int i=0; i<100; i++) myList.add(i);
        Stream<Integer> sequentialStream = myList.stream();

        Stream<Integer> highNums = sequentialStream.filter(p -> p > 90); //filter numbers greater than 90
        System.out.println("High Nums greater than 90=");
        highNums.forEach(p -> System.out.print(p+" "));
    }

    private static void demoMap() {
        System.out.println("\n--------demoMap--------");
        Stream<String> names = Stream.of("aBc", "d", "ef");
        System.out.println(names.map(s -> {
            return s.toUpperCase();
        }).collect(Collectors.toList()));
    }

    private static void demoSorted() {
        System.out.println("\n--------demoSorted--------");
        Stream<String> names2 = Stream.of("aBc", "d", "ef", "123456");
        List<String> reverseSorted = names2.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.print(reverseSorted); // [ef, d, aBc, 123456]

        Stream<String> names3 = Stream.of("aBc", "d", "ef", "123456");
        List<String> naturalSorted = names3.sorted().collect(Collectors.toList());
        System.out.print(naturalSorted); //[123456, aBc, d, ef]
    }

    private static void demoFlatMap() {
        System.out.println("\n--------demoFlatMap--------");
        Stream<List<String>> namesOriginalList = Stream.of(
                Arrays.asList("Pankaj"),
                Arrays.asList("David", "Lisa"),
                Arrays.asList("Amit"));
        Stream<String> flatStream = namesOriginalList
                .flatMap(strList -> strList.stream());
        flatStream.forEach(System.out::println);
    }
}

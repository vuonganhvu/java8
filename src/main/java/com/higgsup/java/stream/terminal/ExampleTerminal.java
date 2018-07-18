package com.higgsup.java.stream.terminal;

import java.util.Optional;
import java.util.stream.Stream;

public class ExampleTerminal {

    public static void main(String[] args) {
        demoReduce();
        demoCount();
        demoFindFirst();
        demoMatch();
    }

    private static void demoReduce() {
        System.out.println("--------------demoReduce--------");
        Stream<Integer> numbers = Stream.of(1,2,3,4,5);
        Optional<Integer> intOptional = numbers.reduce((i, j) -> {return i*j;});
        if(intOptional.isPresent()) System.out.println("Multiplication = "+intOptional.get()); //120
    }

    private static void demoCount() {
        System.out.println("--------------demoCount--------");
        Stream<Integer> numbers1 = Stream.of(1,2,3,4,5);
        System.out.println("Number of elements in stream="+numbers1.count()); //5
    }

    private static void demoMatch() {
        System.out.println("--------------demoMatch--------");
        Stream<Integer> numbers3 = Stream.of(1,2,3,4,5);
        System.out.println("Stream contains 4? "+numbers3.anyMatch(i -> i==4));

        Stream<Integer> numbers4 = Stream.of(1,2,3,4,5);
        System.out.println("Stream contains all elements less than 10? "+numbers4.allMatch(i -> i<10));

        Stream<Integer> numbers5 = Stream.of(1,2,3,4,5);
        System.out.println("Stream doesn't contain 10? "+numbers5.noneMatch(i -> i==10));
    }

    private static void demoFindFirst() {
        System.out.println("--------------demoFindFirst--------");
        Stream<String> names4 = Stream.of("Pankaj", "Amit", "David", "Lisa");
        Optional<String> firstNameWithD = names4.filter(i -> i.startsWith("D")).findFirst();
        if (firstNameWithD.isPresent()) {
            System.out.println("First Name starting with D=" + firstNameWithD.get());
        }
    }

}

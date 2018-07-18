package com.higgsup.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ImprovementsCollectionExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("anhVuOng");
        names.add("CuonGla");
        names.add("hUngnh");
        names.replaceAll(String::toUpperCase);
        System.out.println("----list name after replaceAll---");
        names.forEach(System.out::println);
        System.out.println("----list name after removeIf---");
        names.removeIf("ANHVUONG"::equals);
        names.forEach(System.out::println);
    }
}

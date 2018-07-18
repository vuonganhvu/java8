package com.higgsup.java.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        Map<Long, String> map = new HashMap<>();
        map.put(1L, "anhvv");
        map.compute(1L, (key, newValue) -> {
            return newValue+"_compute";
        });
        map.merge(1L, "merge", (v1, v2) -> {
            return v1+"_"+v2;
        });
        System.out.println("map - "+ map.get(1L));
    }
}

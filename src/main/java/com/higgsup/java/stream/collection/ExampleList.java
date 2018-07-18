package com.higgsup.java.stream.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleList {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Anhvv", 10F));
        students.add(new Student("Hungnh", 3F));
        students.add(new Student("Cuongla", 5F));
        students.add(new Student("Thanhlv", 7F));
        students.add(new Student("Thinhdd", 6F));
        students.add(new Student("Tuha", 4F));
        //Filter list danh sach sinh vien tren trung binh (score > 5)
        System.out.println("-------Filter list student hass core >= 5------");
        List<Student> studentMedium = students.stream()
                .filter(s->s.getScore()>=5)
                .collect(Collectors.toList());
        studentMedium.forEach(System.out::println);
        //Get student co score max
        System.out.println("-------Get student has score max------");
        Student studentScoreMax = students.stream()
                .max((s1, s2) -> s1.getScore().compareTo(s2.getScore()))
                .get();
        System.out.println(studentScoreMax);
        //Print thong tin student use consumer
        System.out.println("-------Print thong tin student------");
        students.stream().forEach(System.out::println);
    }
}

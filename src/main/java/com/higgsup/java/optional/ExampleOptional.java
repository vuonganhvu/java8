package com.higgsup.java.optional;

import java.util.Optional;

public class ExampleOptional {
    public static void main(String[] args) {
        Optional<Student> studentEmpty = Optional.empty();
        Optional<Student> student = Optional.of(new Student("Anhvv", 10F));
        System.out.println("--------present value----");
        student.ifPresent(s->{
            System.out.println("Student " + s.getName() + " and score is " + s.getScore());
        });
        System.out.println("--------empty value----");
        studentEmpty.ifPresent(s->{
            System.out.println("Student " + s.getName() + " and score is " + s.getScore());
        });
        Student defaultStudent = studentEmpty.orElse(new Student("Higgsup", 5F));
        System.out.println("--------DefaultStudent----");
        System.out.println("DefaultStudent is " + defaultStudent);
        System.out.println("--------Demo filter----");
        Optional<Student> filterStudent = student.filter(student1 -> student1.getScore() > 5);
        System.out.println("Filter student is " + filterStudent);
    }
}

package com.higgsup.java;

import com.higgsup.java.functional.FunctionalDemo;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Student implements FunctionalDemo {
    @Override
    public String abstractMethod() {
        return null;
    }

    @Override
    public String defaultMethod() {
        return null;
    }

    public static void printStudent() {
        System.out.println("Student");
    }

    public Student() {
        System.out.println("init student");
    }
}

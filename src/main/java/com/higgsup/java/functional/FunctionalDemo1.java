package com.higgsup.java.functional;

@FunctionalInterface
public interface FunctionalDemo1 extends FunctionalDemo {
    default String defaultMethod() {
        return "Demo default Method in interface";
    }
}

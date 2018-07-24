package com.higgsup.java.defaultMethod;

@FunctionalInterface
public interface InterfaceA {
    default void println() {
        System.out.println("Print method A");
    }

    void test();
}

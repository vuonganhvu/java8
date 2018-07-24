package com.higgsup.java.defaultMethod;

@FunctionalInterface
public interface InterfaceB {
    default void println() {
        System.out.println("Print method B");
    }

    void test();
}

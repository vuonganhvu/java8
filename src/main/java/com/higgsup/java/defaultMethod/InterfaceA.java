package com.higgsup.java.defaultMethod;

public interface InterfaceA {
    default void println() {
        System.out.println("Print method A");
    }
}

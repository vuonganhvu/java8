package com.higgsup.java.defaultMethod;

public interface InterfaceB {
    default void println() {
        System.out.println("Print method A");
    }
}

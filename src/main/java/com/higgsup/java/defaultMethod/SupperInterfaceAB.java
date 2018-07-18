package com.higgsup.java.defaultMethod;

public interface SupperInterfaceAB extends InterfaceA,InterfaceB {
    @Override
    default void println() {
        System.out.println("Print in SupperInterface");
    }
}

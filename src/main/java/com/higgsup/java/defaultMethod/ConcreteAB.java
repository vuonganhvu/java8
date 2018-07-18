package com.higgsup.java.defaultMethod;

public class ConcreteAB implements InterfaceA,InterfaceB {
    @Override
    public void println() {
        System.out.println("print in ConcreteAB...");
    }
}

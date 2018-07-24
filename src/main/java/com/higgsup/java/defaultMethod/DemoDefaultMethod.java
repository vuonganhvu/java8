package com.higgsup.java.defaultMethod;

public class DemoDefaultMethod {
    public static void main(String[] args) {
        ConcreteAB concreteAB = new ConcreteAB();
        concreteAB.println();
        InterfaceA interfaceA = () -> {};
        interfaceA.println();
        InterfaceB interfaceB = () -> {};
        interfaceB.println();
        SupperInterfaceAB supperInterfaceAB = ()->{};
        supperInterfaceAB.println();
    }
}

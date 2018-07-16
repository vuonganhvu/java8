package com.higgsup.java.functional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
public interface FunctionalDemo<T> {

    String field = "";
    String abstractMethod();

    default String defaultMethod() {
//        field = "fdsfds";
        String className = this.getClass().getName();
        System.out.println(className);
        return className;
    }

    default void abc (Consumer<? super T> action) {
        for (T t : (List<T>)this) {
            action.accept(t);
        }
    }

}

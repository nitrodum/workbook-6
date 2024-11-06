package com.pluralsight;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}

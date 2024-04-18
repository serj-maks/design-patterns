package edu.serjmaks.patterns.creational.prototype;

import lombok.SneakyThrows;

public abstract class Prototype<T> implements Cloneable {

    @SneakyThrows
    @SuppressWarnings("unchecked")
    public T copy() {
        return (T) super.clone();
    }
}

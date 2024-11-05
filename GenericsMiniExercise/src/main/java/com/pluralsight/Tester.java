package com.pluralsight;

public class Tester<T, U> {
    private T t;
    private U u;

    public Tester(T t, U u) {
        this.t = t;
        this.u = u;
    }

    public void printT() {
        System.out.println(this.t);
    }

    public void printU() {
        System.out.println(this.u);
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public U getU() {
        return u;
    }

    public void setU(U u) {
        this.u = u;
    }
}

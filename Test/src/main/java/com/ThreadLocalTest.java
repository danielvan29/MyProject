package com;

public class ThreadLocalTest {

    static ThreadLocal<String> local = new ThreadLocal<>();

    public static void main(String[] args) {
        local.set("abc");
    }
}

package com;

@SuppressWarnings("all")
public class PassTest {

    static int a = 10;
    static String s1 = "tom";

    public static void main(String[] args) {
        int b = a;
        b++;
        System.out.println("a:" + a);
        System.out.println("b:" + b);

        Class c = String.class;
        System.out.println(c.getClassLoader());

        Class c1 = PassTest.class;
        System.out.println(c1.getClassLoader());
    }
}

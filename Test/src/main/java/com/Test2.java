package com;

@SuppressWarnings("all")
public class Test2 {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        for (int i = 1; i < 6; i++) {
            b = a = a + i;
            for (int j = 1; j <= i; j++) {
                if (j < i) {
                    System.out.print(b-- + " ");
                }else {
                    System.out.println(b);
                }
            }
        }
    }
}

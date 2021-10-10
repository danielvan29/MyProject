package com;


@SuppressWarnings("all")
public class Test1 {

    public static int calculator(String[] A,int B) {
        int[] b = new int[A.length];
        int i = 0;
        int k = 0;
        while (i < A.length) {
            for (int j = i; j < A.length; j++) {
                i++;
                if (A[j] != null) {
                    b[k] = b[k] + 1;
                }else {
                    break;
                }
            }
            k++;
        }
        for (int i1 : b) {
            if (i1 >= B) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String[] a = {"1", "2", "3", null, "5"};
        System.out.println(calculator(a, 5));
    }
}

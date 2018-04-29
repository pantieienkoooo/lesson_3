package com.company;

import java.util.Arrays;

public class Arrinvert {
    public static void main(String[] args) {
        int[] a = getInts();
        System.out.println(Arrays.toString(a));
    }

    public static int[] getInts() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a1));
        for (int i = 0; i < a.length / 2; i++) {
            int tmp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = tmp;


        }
        return a;
    }
}

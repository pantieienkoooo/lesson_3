package com.company;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        sort();

    }

    public static void sort() {
        int[] a = {2, 7, 2, 8, 0, 3, 2, 7, 9, 5};
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;

                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}

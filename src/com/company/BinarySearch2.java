package com.company;

import java.util.Arrays;

public class BinarySearch2 {
    public static void main(String[] args) {
        int [] arr = {20, 30, 40, 50};
        int pos = Arrays.binarySearch(arr, 25);
        System.out.println(pos);
    }
}

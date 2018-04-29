package com.company;

public class Main {

    public static void invert(int[] arr) {
	for (int k = 0; k < arr.length/2; k++){
	    int tmp = arr[k];
	    arr[k] = arr[arr.length-k-1];
	    arr[arr.length - k -1] = tmp;
    }
    }
}

package com.spicemoney.module4.Exception;

public class arrayIndex {
    public static void main(String[] args) {
        indexOutofBound();
    }

    public static void indexOutofBound() {
        int[] arr = { 1, 2, 23, 45, 58, 100 };
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

package com.spicemoney.module1;

public class Digit {
    public static void main(String[] args) {
        //Write a programto add the digits of a number:using forloopS
//        int sum = 0;
//        for (int i = 1; i < 11; i++) {
//            sum = sum+i;
//        }
//        System.out.println("Sum of numbers is: " + sum);
//      using while:
//        int sum = 0;
//        int i = 1;
//        while ( i < 11) {
//            sum = sum+i;
//            i++;
//        }
//        System.out.println("Sum of numbers is: " + sum);
        //using do-while:
        int sum = 0;
        int i = 1;
       do {
            sum = sum+i;
            i++;

     }
        while ( i < 11);
        System.out.println("Sum of numbers is: " + sum);
    }
}

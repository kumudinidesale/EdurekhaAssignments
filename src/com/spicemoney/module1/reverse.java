package com.spicemoney.module1;

public class reverse {
    public static void main(String[] args) {
        //Write a program to reverse the digits of a number:using forloop.
//        int a =12345;
//        int reverse = 0;
//
//        for (;a != 0; a=a/10) {
//            int remainder = a % 10;
//            reverse = reverse * 10 + remainder;
//
//        }
//        System.out.println("The reverse number of 12345 is: " + reverse);
//
        //    using whileloop:
//        int a =12345;
//        int reverse = 0;
//
//        while (a != 0 ) {
//            int remainder = a % 10;
//            reverse = reverse * 10 + remainder;
//            a=a/10;
//        }
//        System.out.println("The reverse number of 12345 is: " + reverse);
//

       // using do-while:
        int a =12345;
        int reverse = 0;

       do {
            int remainder = a % 10;
            reverse = reverse * 10 + remainder;
            a=a/10;
        }
       while (a != 0 );
        System.out.println("The reverse number of 12345 is: " + reverse);


    }



}

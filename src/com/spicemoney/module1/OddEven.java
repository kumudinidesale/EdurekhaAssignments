package com.spicemoney.module1;

public class OddEven {
    public static void main(String[] args) {
        //Write a program to print 10 even numbers and 10 odd numbers: using forloop
//            for (int i = 1; i < 21; i++) {
//                if (i % 2 == 1) {
//                    System.out.print("odd: "+ i + "  ");
//                }
//                else{
//                    System.out.print("\n even: "+i);
//                }
//            }
//        Using whileloop:
//        int i = 0;
//        while (i < 21) {
//            if (i % 2 == 0) {
//                System.out.print("even: " + i);
//            } else
//                System.out.print("\nodd: " + i + "  ");
//            i++;
//        }
//         using do-while:
        int i = 0;
        do{
            if (i % 2 == 0) {
                System.out.print("even: " + i);
            } else
                System.out.print("\nodd: " + i + "  ");
            i++;
        }while (i < 21);
    }


    }
package com.spicemoney.module1;

public class GenerateTables {
    public static void main(String[] args) {

        //Write a program to generate tables of 10.
        //using forloop:
        for (int i = 1; i < 11; i++) {
            System.out.println("Table of 10 is: " + i * 10);
        }

        /*
        int i = 1;
        while (i < 11) {
            System.out.println("Table of 10 is: " + i * 10);
            i++;
        }
         */
//        using do-while:
        int i = 1;
        do{
            System.out.println("Table of 10 is: " + i * 10);
            i++;
        }while (i < 11);
    }
}
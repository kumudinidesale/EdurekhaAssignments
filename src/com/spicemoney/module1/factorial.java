package com.spicemoney.module1;

public class factorial {
    public static void main(String[] args) {
        // Write a program to find factorial ofa number.:
        //using forloop:
//        int number=4;
//        int fact=1;
//
//            for(int i = 1; i <= number; i++)
//            {
//                fact = fact * i;
//            }
//        System.out.println("Factorial of "+number+" is: "+fact);


        //using while loop
//        int number = 4;
//        int fact = 1;
//        int i = 1;
//        while (i <= number) {
//
//            fact = fact * i;
//            i++;
//        }
//        System.out.println("Factorial of "+number+" is: "+fact);
//        }

        //Do_while loop
        int number = 4;
        int fact = 1;
        int i = 1;
        do {

            fact = fact * i;
            i++;
        }
        while (i <= number);

        System.out.println("Factorial of " + number + " is: " + fact);

    }
}



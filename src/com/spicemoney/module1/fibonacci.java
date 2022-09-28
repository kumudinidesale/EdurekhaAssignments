package com.spicemoney.module1;

public class fibonacci {
    public static void main(String[] args) {

//        int n = 10, firstTerm = 0, secondTerm = 1;
//        System.out.println("Fibonacci Series till " + n + " terms:");
//
//        for (int i = 1; i <= n; ++i) {
//            System.out.print(firstTerm + ", ");
//
//            // compute the next term
//            int nextTerm = firstTerm + secondTerm;
//            firstTerm = secondTerm;
//            secondTerm = nextTerm;
//        }

        //whileloop
//        int n = 10, firstTerm = 0, secondTerm = 1;
//       System.out.println("Fibonacci Series till " + n + " terms:");
//        int i = 1;
//        while ( i <= n ) {
//            System.out.print(firstTerm + ", ");
//
//
//            int nextTerm = firstTerm + secondTerm;
//            firstTerm = secondTerm;
//            secondTerm = nextTerm;
//            ++i;
//        }
        //do-while:
        int n = 10, firstTerm = 0, secondTerm = 1;
       System.out.println("Fibonacci Series till " + n + " terms:");
        int i = 1;
       do {
            System.out.print(firstTerm + ", ");


            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            ++i;
        }
       while ( i <= n );
    }
}

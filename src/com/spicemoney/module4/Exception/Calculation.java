package com.spicemoney.module4.Exception;

public class Calculation {
    public static void main(String[] args) {
        Calculation cal = new Calculation();
        cal.subtract(21, 9);
        cal.add(25, 15);
        cal.divide(200, 20);
        cal.multiply(5, 15);
        cal.factorial(4);
        cal.numReverse(1234567);
    }

    public void subtract(int a, int b) {
        int c = a - b;
        System.out.println("Subtraction is " + c);
    }

    public void add(int a, int b) {
        int c = a + b;
        System.out.println("Add is " + c);
    }

    public void multiply(int a, int b) {
        int c = a + b;
        System.out.println("Multiplication is :" + c);
    }

    public void divide(int a, int b) {
        int c = a + b;
        System.out.println("Division is :" + c);
    }

    public void factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        System.out.println("Factorial is " + fact);

    }

    public void numReverse(int num) {
        int rev = 0;
        for (int i = 0; i < 4; i++) {
            int rem = num % 10;
            rev = +rem;
            num = num / 10;
            System.out.print(rev);
        }

    }
}

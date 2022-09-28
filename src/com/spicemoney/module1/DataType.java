package com.spicemoney.module1;

public class DataType {
    public static void main(String[] args) {
        int a = 10;
        int b = 24;
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        double div = b/a;
        float remainder = b%a;


        System.out.println("sum of 10 and 24 is: " + sum);
        System.out.println("sub of 10 and 24 is: " + sub);
        System.out.println("mul of 10 and 24 is: " + mul);
        System.out.println("div of 24 and 10 is: " + div);
        System.out.println("remainder of 24 and 10 is: " + remainder);


        int x = 9;
        b = x++;
        System.out.println("The value of b is: " + b);
        System.out.println("The value of y is: " + x);
        b = ++x;
        System.out.println("The value of b is: " + b);
        System.out.println("The value of y is: " + x);

        int y = 9;
        b = y--;
        System.out.println("The value of b is: " + b);
        System.out.println("The value of y is: " + y);
        b = --y;
        System.out.println("The value of b is: " + b);
        System.out.println("The value of y is: " + y);


    }
}

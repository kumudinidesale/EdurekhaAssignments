package com.spicemoney.module2;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        int a[] = { 1, 2, 3, 4, 5 };
        String s[] = { "sweety", "Priya", "Prath", "Shubham", "kumud" };
        String[] salary = { "22000", "43000", "65000", "1000", "56000" };

        employeeData(a, s, salary);
        System.out.println();
        employeeData(a, s);
        System.out.println();
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        name = sc.nextLine();
        for (int i = 0; i < 5; i++) {
            if (name.equals(s[i])) {
                System.out.println(a[i] + " " + salary[i]);
            }
        }

    }

    static void employeeData(int[] a, String[] s, String[] salary) {

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " " + s[i] + "   " + salary[i]);
        }

    }

    static void employeeData(int[] a, String[] s) {

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " " + s[i]);
        }

    }


}

package com.spicemoney.module4.Exception;

public class ExceptionPack {
    public static void main(String[] args) {
        Calculation cal = new Calculation();
        cal.add(10, 10);
        cal.divide(10, 10);
        cal.subtract(10, 10);
        cal.multiply(10, 10);
        cal.factorial(10);
        cal.numReverse(9876543);
    }
}

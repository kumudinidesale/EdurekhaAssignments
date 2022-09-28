package com.spicemoney.module5;

public class ArrayListint {
    public static void main(String[] args) {
        ArrayListint store = new ArrayListint();
        store.storeData();

    }

    public void storeData() {
        ArrayListint arr = new ArrayListint();

        for (int i = 1; i <= 10; i++) {
            arr.add(i);

        }
        System.out.println(arr);
    }

    private void add(int i) {
    }
}

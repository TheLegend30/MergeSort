package com.company;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000);
        }
        System.out.println("Before sorting");
        for (int k : arr) {
            System.out.println(k);
        }
        Sorting.Sort(arr);
        System.out.println("After sorting");
        for (int j : arr) {
            System.out.println(j);
        }
    }
}

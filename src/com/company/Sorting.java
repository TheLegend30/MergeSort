package com.company;

public class Sorting{
    public static void Sort(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        int midsize = arr.length / 2;
        int[] leftArr = new int[midsize];
        int[] rightArr = new int[arr.length - midsize];
        for (int i = 0; i < midsize; i++) {
            leftArr[i] = arr[i];
        }
        for (int i = midsize; i < arr.length; i++) {
            rightArr[i - midsize] = arr[i];
        }
        Sort(leftArr);
        Sort(rightArr);
        Merge(arr, leftArr, rightArr);
    }

    public static void Merge(int[] arr, int[] leftArr, int[] rightArr) {
        int i = 0, j = 0, k = 0;
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i < leftArr.length) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < rightArr.length) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
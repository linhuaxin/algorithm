package com.linhuaxin.algorithm;

import java.util.Arrays;

public class SelectionSort {

    public static void sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 9, 7};
        sort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
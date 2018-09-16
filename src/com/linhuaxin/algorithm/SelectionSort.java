package com.linhuaxin.algorithm;

import java.util.Arrays;

public class SelectionSort {

    public static <T extends Comparable<T>> void sort(T[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                T temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Integer arr[] = {1, 3, 5, 9, 7};
        sort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
package com.linhuaxin.algorithm;

public class InsertionSort implements Sortable {

    @Override
    public <T extends Comparable<T>> void sort(T[] arr, int n) {

        for (int i = 1; i < n; i++) {

            // 寻找元素 arr[i] 合适的插入位置
            T e = arr[i];
            int j; // j保存元素e应该插入的位置
            for (j = i; j > 0 && arr[j].compareTo(arr[j - 1]) < 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = e;
        }
    }
}
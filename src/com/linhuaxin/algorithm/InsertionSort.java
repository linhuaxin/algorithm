package com.linhuaxin.algorithm;

public class InsertionSort implements Sortable {

    @Override
    public <T extends Comparable<T>> void sort(T[] arr, int n) {

        for (int i = 1; i < n; i++) {

            // 虚招元素 arr[i] 合适的插入位置
            for (int j = i; j > 0 && arr[j].compareTo(arr[j - 1]) < 0; j--) {
                T temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
    }
}
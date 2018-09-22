package com.linhuaxin.algorithm;

public class MergeSortBU implements Sortable {

    @Override
    public void sort(int arr[], int n) {
        for (int sz = 1; sz <= n; sz += sz) {
            for (int i = 0; i + sz < n; i += sz + sz) {
                MergeSort.__merge(arr, i, i + sz - 1, Math.min(i + sz + sz - 1, n - 1));
            }
        }
    }
}
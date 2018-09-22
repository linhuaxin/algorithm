package com.linhuaxin.algorithm;

public class MergeSort implements Sortable {

    // 将arr[l...mid]和arr[mid+1...r]两部分进行归并
    public static void __merge(int[] arr, int l, int mid, int r) {
        Integer[] aux = new Integer[r - l + 1];

        for (int i = l; i <= r; i++) {
            aux[i - l] = arr[i];
        }

        int i = l, j = mid + 1;
        for (int k = l; k <= r; k++) {
            if (i > mid) {
                arr[k] = aux[j - l];
                j++;
            } else if (j > r) {
                arr[k] = aux[i - l];
                i++;
            } else if (aux[i - l] < aux[j - l]) {
                arr[k] = aux[i - l];
                i++;
            } else {
                arr[k] = aux[j - l];
                j++;
            }
        }
    }

    // 递归使用归并排序，对arr[l...r]的范围进行排序
    private void __mergeSort(int[] arr, int l, int r) {
        if (r - l <= 15) {
            new InsertionSort().sort(arr, l, r);
            return;
        }

        int mid = (l + r) / 2;
        __mergeSort(arr, l, mid);
        __mergeSort(arr, mid + 1, r);
        if (arr[mid] > arr[mid + 1]) {
            __merge(arr, l, mid, r);
        }
    }

    @Override
    public void sort(int arr[], int n) {
        __mergeSort(arr, 0, n - 1);
    }
}
package com.linhuaxin.algorithm;

public class Test {

    public static void main(String[] args) {
        int n = 50000;
        int arr[] = SortTestHelper.generateNearlyOrderArray(n, 10);
        int arr2[] = SortTestHelper.copyIntArray(arr, n);
        SortTestHelper.testSort("Insertion Sort", new InsertionSort(), arr, n);
        SortTestHelper.testSort("Merge Sort", new MergeSort(), arr2, n);
    }
}
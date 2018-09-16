package com.linhuaxin.algorithm;

public class Test {

    public static void main(String[] args) {
        int n = 10000;
        Integer arr[] = SortTestHelper.generateRandomArray(n, 0, n);
        Integer arr2[] = SortTestHelper.copyIntArray(arr, n);
        SortTestHelper.testSort("Selection Sort", new SelectionSort(), arr, n);
        SortTestHelper.testSort("Insertion Sort", new InsertionSort(), arr2, n);
    }
}
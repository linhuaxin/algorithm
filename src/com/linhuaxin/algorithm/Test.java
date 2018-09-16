package com.linhuaxin.algorithm;

public class Test {

    public static void main(String[] args) {
        int n = 100000;
        Integer arr[] = SortTestHelper.generateRandomArray(n, 0, n);
        SortTestHelper.testSort("Selection Sort", new SelectionSort(), arr, n);
    }
}
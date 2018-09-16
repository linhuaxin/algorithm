package com.linhuaxin.algorithm;

public interface Sortable {
    <T extends Comparable<T>> void sort(T[] arr, int n);
}

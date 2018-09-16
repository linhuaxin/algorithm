package com.linhuaxin.algorithm;

public class SortTestHelper {

    // 生成有n个元素的随机数组，每个元素的随机范围为[rangL, rangR]
    public static Integer[] generateRandomArray(int n, int rangL, int rangR) {
        assert rangL <= rangR;

        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * (rangR - rangL + 1)) + rangL;
        }

        return arr;
    }

    // 生成有n个元素的随机数组，每个元素的随机范围为[rangL, rangR]
    public static Integer[] generateNearlyOrderArray(int n, int swapTimes) {
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < swapTimes; i++) {
            int posx = (int)(Math.random() * n);
            int posy = (int)(Math.random() * n);

            Integer temp = arr[posx];
            arr[posx] = arr[posy];
            arr[posy] = temp;
        }

        return arr;
    }

    /**
     * 复制一个整型数组
     */
    public static Integer[] copyIntArray(Integer[] a, int n) {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = a[i];
        }
        return arr;
    }

    public static <T> void printArray(T arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * 计算排序时间
     */
    public static void testSort(String sortName, Sortable sortable, Integer[] arr, int n) {
        long startTime = System.nanoTime();
        sortable.sort(arr, n);
        long endTime = System.nanoTime();

        assert SortTestHelper.isSorted(arr, n);
        System.out.println(sortName + " : " + (endTime - startTime) + "us");
    }

    /**
     * 判断一个数组是否排好序
     */
    public static <T extends Comparable<T>> boolean isSorted(T[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i].compareTo(arr[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }
}
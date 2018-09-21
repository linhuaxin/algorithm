package com.linhuaxin.algorithm;

public class SortTestHelper {

    // 生成有n个元素的随机数组，每个元素的随机范围为[rangL, rangR]
    public static int[] generateRandomArray(int n, int rangL, int rangR) {
        assert rangL <= rangR;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * (rangR - rangL + 1)) + rangL;
        }

        return arr;
    }

    // 生成有n个元素的随机数组，每个元素的随机范围为[rangL, rangR]
    public static int[] generateNearlyOrderArray(int n, int swapTimes) {
        int[] arr = new int[n];

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
    public static int[] copyIntArray(int[] a, int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = a[i];
        }
        return arr;
    }

    public static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * 计算排序时间
     */
    public static void testSort(String sortName, Sortable sortable, int[] arr, int n) {
        long startTime = System.currentTimeMillis();
        sortable.sort(arr, n);
        long endTime = System.currentTimeMillis();

        assert SortTestHelper.isSorted(arr, n);
        System.out.println(sortName + " : " + (endTime - startTime) + "ms");
    }

    /**
     * 判断一个数组是否排好序
     */
    public static boolean isSorted(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
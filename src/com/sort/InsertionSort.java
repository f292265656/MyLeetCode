package com.sort;

/**
 * http://blog.csdn.net/morewindows/article/details/6665714
 * @author fei.wu
 * Sep 7, 2017
 */
public class InsertionSort {
    
    static void insertSort1(int[] a, int n) {
        int i,j;
        for (i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {
                int tmp = a[i];
                for (j = i - 1; j >= 0 && a[j] > tmp; j--) {
                    a[j + 1] = a[j];
                }
                a[j + 1] = tmp;
            }
        }
    }
    
    void insertSort2(int[] a, int n) {
        int i,j;
        for (i = 1; i < n; i++) {
            for (j = i - 1; j >= 0 && a[j] > a[j + 1]; j--) {
                Common.swap(a, j, j + 1);
            }
        }
    }
}

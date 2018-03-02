package com.sort;

/**
 * http://blog.csdn.net/morewindows/article/details/6671824
 * @author fei.wu
 * Sep 7, 2017
 */
public class SelectSort {

    static void selectSort(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            int minNumIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minNumIndex]) {
                    minNumIndex = j;
                }
            }
            Common.swap(a, i, minNumIndex);
        }
    }
}

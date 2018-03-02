package com.sort;

import java.util.Arrays;

/**
 * http://blog.csdn.net/morewindows/article/details/6657829
 * @author fei.wu
 * Sep 7, 2017
 */
public class BubbleSort {
    static void BubbleSort1(int a[], int n) {
        int i, j;
        for (i = 0; i < n; i++)
            for (j = 1; j < n - i; j++)
                if (a[j - 1] > a[j]) Common.swap(a, j - 1, j);
    }

    static void bubbleSort2(int[] a, int n) {
        int flag, k;
        flag = n;
        while (flag > 0) {
            k = flag;
            flag = 0;
            for (int i = 1; i < k; i++) {
                if (a[i -1 ] > a[i]) {
                    Common.swap(a, i - 1 , i);
                    flag = i;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] s = {66,123,44,21,15,7,77,156,33};
        bubbleSort2(s, s.length);
        System.out.println(Arrays.toString(s));
    }

}

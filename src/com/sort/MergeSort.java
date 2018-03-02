package com.sort;

import java.util.Arrays;

/**
 * http://blog.csdn.net/morewindows/article/details/6678165
 * 
 * @author fei.wu Sep 7, 2017
 */
public class MergeSort {

    static void mergeArray(int[] a, int first, int mid, int last, int[] temp) {
        int i = first, j = mid + 1;
        int n = mid, m = last;
        int k = 0;
        while (i <= n && j <= m) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }

        while (i <= n) {
            temp[k++] = a[i++];
        }

        while (j <= m) {
            temp[k++] = a[j++];
        }

        for (i = 0; i < k; i++) {
            a[first + i] = temp[i];
        }
    }

    static void mergeSort(int[] a, int first, int last, int[] temp) {
        if (first < last) {
            int mid = (first + last) / 2;
            mergeSort(a, first, mid, temp);
            mergeSort(a, mid + 1, last, temp);
            mergeArray(a, first, mid, last, temp);
        }
    }

    static void mergeSort(int[] a, int n) {
        int[] temp = new int[a.length];
        mergeSort(a, 0, a.length - 1, temp);
    }

    public static void main(String[] args) {
        int[] s = {66, 123, 44, 21, 15, 7, 77, 156, 33};
        mergeSort(s, s.length);
        System.out.println(Arrays.toString(s));
    }

}

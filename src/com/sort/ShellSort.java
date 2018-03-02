package com.sort;

/**
 * http://blog.csdn.net/morewindows/article/details/6668714
 * 
 * @author fei.wu Sep 7, 2017
 */
public class ShellSort {

    static void shellSort(int[] a, int n) {
        int i, j, gap;

        for (gap = n / 2; gap > 0; gap /= 2) {
            for (i = gap; i < n; i++) {
                for (j = i - gap; j >= 0 && a[j] > a[j + gap]; j -= gap) {
                    Common.swap(a, j, j + gap);
                }
            }
        }
    }

    public static void main(String[] args) {
        // int[] s = {66,123,44,21,15,7,77,156,33};
        // shellSort(s, s.length);
        // System.out.println(Arrays.toString(s));
        int[] a = {1, 2, 1};
        System.out.println(FindRepeatNumberInArray(a, a.length));

    }

    final static int NO_REPEAT_FLAG = -1;

    static int FindRepeatNumberInArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            int nRealIndex = a[i] >= n ? a[i] - n : a[i];
            if (a[nRealIndex] >= n) // 这个位置上的值大于n说明已经是第二次访问这个位置了
                return nRealIndex;
            else
                a[nRealIndex] += n;
        }
        return NO_REPEAT_FLAG; // 数组中没有重复的数
    }

}

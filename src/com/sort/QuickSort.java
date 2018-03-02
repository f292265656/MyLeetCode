package com.sort;

import java.util.Arrays;

/**
 * http://blog.csdn.net/morewindows/article/details/6684558
 * @author fei.wu
 * Sep 7, 2017
 */
public class QuickSort {
    
    public static void quickSort(int[] s, int l, int r) {
        if (l < r) {
            int i = l, j = r, x = s[l];
            while (i < j) {
                while (i < j && s[j] >= x) {
                    j--;
                }
                if (i < j) {
                    s[i++] = s[j];
                }
                while (i < j && s[i] < x) {
                    i++;
                }
                if (i < j) {
                    s[j--] = s[i];
                }
            }
            s[i] = x;
            quickSort(s, l, i - 1);
            quickSort(s, i + 1, r);
        }
    }
    
    public static void main(String[] args) {
        int[] s = {66,123,44,21,15,7,77,156,33};
        quickSort(s, 0, s.length - 1);
        System.out.println(Arrays.toString(s));
    }
    
    void quick_sort(int s[], int l, int r)  
    {  
        if (l < r)  
        {  
            //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1  
            int i = l, j = r, x = s[l];  
            while (i < j)  
            {  
                while(i < j && s[j] >= x) // 从右向左找第一个小于x的数  
                    j--;    
                if(i < j)   
                    s[i++] = s[j];  
                  
                while(i < j && s[i] < x) // 从左向右找第一个大于等于x的数  
                    i++;    
                if(i < j)   
                    s[j--] = s[i];  
            }  
            s[i] = x;  
            quick_sort(s, l, i - 1); // 递归调用   
            quick_sort(s, i + 1, r);  
        }  
    }  

}

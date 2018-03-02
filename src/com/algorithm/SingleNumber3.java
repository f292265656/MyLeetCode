package com.algorithm;

import java.util.Arrays;

public class SingleNumber3 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3,1, 2, 5};
        int[] ret=singleNumber(nums);
        for (int i : ret) {
            System.out.print(i+" ");
        }
    }

    public static int[] singleNumber(int[] nums) {
        if (nums.length <= 2) {
            return nums;
        }
        Arrays.sort(nums);
        int k = 0;
        int len=nums.length;
        int[] ret = new int[2];
        
        if (nums[0]!=nums[1]) {
            ret[k++]=nums[0];
        }
        if (nums[len-1]!=nums[len-2]) {
            ret[k++]=nums[len-1];
        }
        for (int i = 1; i < len - 1; i++) {
            if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                ret[k++] = nums[i];
            }
            if (k==2) {
                break;
            }
        }
        return ret;
    }

}

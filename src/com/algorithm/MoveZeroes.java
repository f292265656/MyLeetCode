package com.algorithm;

import java.util.ArrayList;
import java.util.List;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = {1,0};
//        moveZeroes(nums);
        moveZeroes1(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public static void moveZeroes(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : nums) {
            if (i != 0) {
                list.add(i);
            }
        }
        int k = 0;
        for (Integer integer : list) {
            nums[k++] = integer;
        }
        for (int i = k; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
    
    public static void moveZeroes1(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
}

package com.algorithm;

public class ProductArrayExceptSelf {
    
    public static void main(String[] args) {
//        int[] nums = {1,3,4,0,-1,-2};
        int[] nums = {0,1,3,4,0,-1,-2};
        //int[] nums = {1,3,4,0,-1,-2};
        int [] res=productExceptSelf(nums);
        
        
        for (int i : res) {
            System.out.print(i+" ");
        }
        
    }
    
    public static int[] productExceptSelf(int[] nums) {
        int count = 0;
        int totalProduct = 1;
        boolean flag = false;
        for (int num : nums) {
            if (num != 0) {
                totalProduct *= num;
            }else {
                flag = true;
                count++;
                if (count >= 2) {
                    int[] res = new int[nums.length];
                    return res;
                }
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (flag) {
                if (nums[i] != 0) {
                    nums[i] = 0;
                }else {
                    nums[i] = totalProduct;
                }
            }else {
                nums[i] = totalProduct / nums[i];
            }
        }
        
        return nums;
    }
    
    //==================================================
    //By NetWork
    /**
     * The idea is simply. The product basically is calculated using the numbers before the current 
     * number and the numbers after the current number. Thus, we can scan the array twice. First, 
     * we calcuate the running product of the part before the current number. Second, we calculate 
     * the running product of the part after the current number through scanning from the end of the 
     * array.
     * @param nums
     * @return
     */
    public static int[] productExceptSelf2(int[] nums) {
        int leng = nums.length;
        int[] ret = new int[leng];
        if(leng == 0)
            return ret;
        int runningprefix = 1;
        for(int i = 0; i < leng; i++){
            ret[i] = runningprefix;
            runningprefix*= nums[i];
        }
        int runningsufix = 1;
        for(int i = leng -1; i >= 0; i--){
            ret[i] *= runningsufix;
            runningsufix *= nums[i];
        }
        return ret;
    }
    
}

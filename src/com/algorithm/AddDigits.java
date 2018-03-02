package com.algorithm;

/**
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one
 * digit.
 * 
 * For example:
 * 
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return
 * it.
 * 
 * Follow up: Could you do it without any loop/recursion in O(1) runtime?
 *
 */

public class AddDigits {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(new AddDigits().addDigits(1234567));
    }

    public int addDigits(int num) {
        String tmpStr = num+"";
        System.out.println(tmpStr.length());
        int res = 0;
        for (int i = 0; i < tmpStr.length(); i++) {
            res += Integer.parseInt(""+tmpStr.charAt(i));
        }
        
        if (res/10>0) {
            int tmpRes = res/10+res%10;
            if (tmpRes/10>0) {
                return tmpRes/10+tmpRes%10;
            }
            return tmpRes;
        }
        return res;
    }
    
    //===============================================================
    //by network
    
    public int addDigitsByMath(int num) {
        if (num == 0) {
            return num;
        }
        int res = num % 9;
        if (res == 0) {
            return 9;
        }
        return res;
    }
    
    
   
    int addDigitsByRecursion(int num) {
        if (num < 10) return num;
        return addDigits(num % 10 + addDigits(num / 10));
    }
    
   
}

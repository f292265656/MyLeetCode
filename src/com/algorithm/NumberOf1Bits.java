package com.algorithm;

/**
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also
 * known as the Hamming weight).
 * 
 * For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011,
 * so the function should return 3.
 * 
 * @author feiwu
 *
 */
public class NumberOf1Bits {
    public static void main(String[] args) {

        System.out.println(new NumberOf1Bits().hammingWeight(214748355));
    }

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
      //不能用n>0作判断条件否则无法处理 2147483648 (10000000000000000000000000000000)
        //.位移要用无符号的位移>>>
        for (; n != 0; n >>>= 1) {   
            if ((n & 1) == 1) {
                count++;
            }
        }
        return count;
    }
}

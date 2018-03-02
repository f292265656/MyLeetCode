package com.algorithm;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {
    public static void main(String[] args) {
//        getGrayCode(3);
        
        System.out.println(grayCode(3));
    }
    
    public static List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < 1<<n; i++) {
            res.add(i^i>>1);
        }
        return res;
    }
    
    public static  void getGrayCode(int bitNum){
        for(int i = 0; i < (1<<bitNum); i++){
            int grayCode = (i >> 1) ^ i;
            System.out.print(num2Binary(grayCode, bitNum)+" ");
        }
    }
    public static String num2Binary(int num, int bitNum){
        String ret = "";
        for(int i = bitNum-1; i >= 0; i--){
            ret += (num >> i) & 1;
        }
        return ret;
    }
}

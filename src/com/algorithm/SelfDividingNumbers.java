package com.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/self-dividing-numbers/description/
 * 
 * A self-dividing number is a number that is divisible by every digit it
 * contains.
 * 
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 ==
 * 0, and 128 % 8 == 0.
 * 
 * Also, a self-dividing number is not allowed to contain the digit zero.
 * 
 * Given a lower and upper number bound, output a list of every possible self
 * dividing number, including the bounds if possible.
 * 
 * Example 1: Input: left = 1, right = 22 Output: [1, 2, 3, 4, 5, 6, 7, 8, 9,
 * 11, 12, 15, 22]
 * 
 * @author fei.wu
 *
 */
public class SelfDividingNumbers {

	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<>();
		for (int i = left; i <= right; i++) {
			String leftString  = i + "";
			
			int j = 0;
			for (j = 0; j < leftString.length(); j++) {
				char c = leftString.charAt(j);
				if (c == '0' || i % (c - '0') != 0) {
					break;
				}
			}
			if (j == leftString.length()) {
				list.add(i);
			}
		}
		return list;

	}
	
	public static void main(String[] args) {
//		char c = '5';
//		int res = 10 % (c - '0');
//		System.out.println(res);
		System.out.println(new SelfDividingNumbers().selfDividingNumbers(10, 31));
	}
	
	public List<Integer> selfDividingNumbers1(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int j = i;
            for (; j > 0; j /= 10) {
                if ((j % 10 == 0) || (i % (j % 10) != 0)) break;
            }
            if (j == 0) list.add(i);
        }
        return list;
    }

}

package com.algorithm;

/**
 * https://leetcode.com/problems/complex-number-multiplication/description/
 * 
 * Given two strings representing two complex numbers.
 * 
 * You need to return a string representing their multiplication. Note i2 = -1
 * according to the definition.
 * 
 * Example 1: Input: "1+1i", "1+1i" Output: "0+2i" Explanation: (1 + i) * (1 +
 * i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.
 * Example 2: Input: "1+-1i", "1+-1i" Output: "0+-2i" Explanation: (1 - i) * (1
 * - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.
 * Note:
 * 
 * The input strings will not have extra blank. The input strings will be given
 * in the form of a+bi, where the integer a and b will both belong to the range
 * of [-100, 100]. And the output should be also in this form.
 * 
 * @author fei.wu
 *
 */
public class ComplexNumberMultiplication {

	public String complexNumberMultiply(String a, String b) {
		String[] arrA = a.split("\\+");
		String[] arrB = b.split("\\+");
		Integer a1 = Integer.valueOf(arrA[0]);
		Integer a2 = Integer.valueOf(arrA[1].substring(0, arrA[1].indexOf("i")));
		Integer b1 = Integer.valueOf(arrB[0]);
		Integer b2 = Integer.valueOf(arrB[1].substring(0, arrB[1].indexOf("i")));
		
		int left = a1 * b1 + (-a2 * b2);
		int right = a1 * b2 + a2 * b1;
		
		return left + "+" + right + "i";
	}
	
	public static void main(String[] args) {
		System.out.println(new ComplexNumberMultiplication().complexNumberMultiply("1+-1i", "1+-1i"));
	}

}

package com.algorithm;

/**
 * https://leetcode.com/problems/hamming-distance/description/
 * 
 * @author fei.wu
 *
 *         The Hamming distance between two integers is the number of positions
 *         at which the corresponding bits are different.
 * 
 *         Given two integers x and y, calculate the Hamming distance.
 * 
 *         Note: 0 ≤ x, y < 231.
 * 
 *         Example:
 * 
 *         Input: x = 1, y = 4
 * 
 *         Output: 2
 * 
 *         Explanation: 1 (0 0 0 1) 4 (0 1 0 0) ↑ ↑
 *
 */
public class HammingDistance {

	public int hammingDistance(int x, int y) {
		int xor = x ^ y;
		int num = 0;
		while (xor > 0) {
			if (xor % 2 == 1) {
				num++;
			}
			xor = xor >> 1;
		}
		return num;
	}

	public static void main(String[] args) {
		System.out.println(new HammingDistance().hammingDistance(5, 8));
	}
}

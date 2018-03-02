package com.algorithm;

/**
 * https://leetcode.com/problems/jewels-and-stones/description/
 * 
 * 
 * You're given strings J representing the types of stones that are jewels, and
 * S representing the stones you have. Each character in S is a type of stone
 * you have. You want to know how many of the stones you have are also jewels.
 * 
 * The letters in J are guaranteed distinct, and all characters in J and S are
 * letters. Letters are case sensitive, so "a" is considered a different type of
 * stone from "A".
 * 
 * Example 1:
 * 
 * Input: J = "aA", S = "aAAbbbb" Output: 3 Example 2:
 * 
 * Input: J = "z", S = "ZZ" Output: 0
 * 
 * @author fei.wu
 *
 */
public class JewelsAndStones {

	public int numJewelsInStones(String J, String S) {
		int sum = 0;
		for (int i = 0; i < S.length(); i++) {
			for (int k = 0; k < J.length(); k++) {
				if (S.charAt(i) == J.charAt(k)) {
					sum++;
					break;
				}
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		// String string = "abcdesd";
		// for (int i = 0; i < string.length(); i++) {
		// System.out.println("charAt: " + string.charAt(i));
		// }
		System.out.println(new JewelsAndStones().numJewelsInStones("aA", "aAAbbbb"));
	}

}

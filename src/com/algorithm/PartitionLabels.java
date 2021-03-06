package com.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/partition-labels/description/
 * 
 * A string S of lowercase letters is given. We want to partition this string
 * into as many parts as possible so that each letter appears in at most one
 * part, and return a list of integers representing the size of these parts.
 * 
 * Example 1: Input: S = "ababcbacadefegdehijhklij" Output: [9,7,8] Explanation:
 * The partition is "ababcbaca", "defegde", "hijhklij". This is a partition so
 * that each letter appears in at most one part. A partition like
 * "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less
 * parts. Note:
 * 
 * S will have length in range [1, 500]. S will consist of lowercase letters
 * ('a' to 'z') only.
 * 
 * 
 * @author fei.wu
 *
 */
public class PartitionLabels {

	public List<Integer> partitionLabels(String S) {
		char[] originStr = S.toCharArray();
		
		List<String> partStr = new ArrayList<>();
		for (int i = 0; i < originStr.length; i++) {
			partStr.add(String.valueOf(originStr[i]));
			
			int j = i - 1;
			for (; j >= 0; j--) {
				if (!"".equals(partStr.get(j)) && partStr.get(j).contains(String.valueOf(originStr[i]))) {
					break;
				}
			}
			
			if (j >= 0) {
				// 需要合并j 到 i 的字符串, 并清空后面的字符串
				int tempJ = j + 1;
				StringBuffer sb = new StringBuffer();
				sb.append(partStr.get(j));
				while (tempJ <= i) {
					if (!"".equals(partStr.get(tempJ))) {
						sb.append(partStr.get(tempJ));
						partStr.set(tempJ, "");
					}
					tempJ++;
				}
				partStr.set(j, sb.toString());
				
			} 
		}
		
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < partStr.size(); i++) {
			if (!"".equals(partStr.get(i))) {
				result.add(partStr.get(i).length());
			}
		}
		
		return result;

	}
	
	public static void main(String[] args) {
		System.out.println(new PartitionLabels().partitionLabels("ababcbacadefegdehijhklij"));
	}

}

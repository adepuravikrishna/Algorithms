package com.adepu.ravikrishna.linkedlists;

import java.util.Stack;

public class AmazingString {

	public static void main(String[] args) {
		String[] w = { "ab", "aab", "abb", "abab", "abaaaba" };
		int[] n = minimalOperations(w);
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
	}

	/*
	 * Complete the function below.
	 */
	static int[] minimalOperations(String[] words) {
		int[] minOp = new int[words.length];

		for (int i = 0; i < words.length; i++) {
			char[] ch = words[i].toCharArray();
			Stack<Character> s = new Stack<Character>();
			int count = 0;
			if (ch.length == 1) {
				minOp[i] = 1;
				continue;
			}
			for (int j = 0; j < ch.length; j++) {
				if (j == 0) {
					s.push(ch[j]);
				} else {

					if (!s.isEmpty()) {
						if (s.peek() == ch[j]) {
							count = count + 1;
							if(j+1<ch.length && ch[j+1] == s.peek()){
								
								count=count-1;
							}
							continue;
						} else {
							s.push(ch[j]);
						}
					}
				}

			}
			minOp[i] = count;
		}
		return minOp;

	}

}

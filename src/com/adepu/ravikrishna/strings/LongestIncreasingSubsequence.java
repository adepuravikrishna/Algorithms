package com.adepu.ravikrishna.strings;

public class LongestIncreasingSubsequence {
	public static void main(String[] args) {
		int[] arr={10, 9, 2, 5, 3, 7, 101, 18};
		int length= lengthOfLIS(arr);
		System.out.println(length);;

	}

	public static int lengthOfLIS(int[] arr) {
		if (arr == null || arr.length == 0)
			return 0;
		if (arr.length == 1)
			return 1;

		int T[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			T[i] = 1;

		}

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					T[i] = Math.max(T[i], T[j] + 1);
				}
			}
		}

		// find the index of max number in T
		int max = 0;
		for (int i = 0; i < T.length; i++) {
			if (T[i] > max) {
				max = T[i];
			}
		}

		return max;
	}

}

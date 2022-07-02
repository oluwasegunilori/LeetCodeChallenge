package com.shegz.learning;

public class CountBits {

	public int[] countBits(int n) {
		int[] result = new int[n + 1];

		for (int i = 0; i <= n; i++) {
			var count = 0;
			for (int j = 0; j <= 31; j++) {
				//Checks if the bit at each point is a set bit
				if ((n & (1 << j)) > 0) {
					count++;
				}
			}
			result[i] = count;
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(new CountBits().countBits(5));

	}

}

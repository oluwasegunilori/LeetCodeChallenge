package com.shegz.learning;

public class MaximumProductSubarray {

	public int maxProduct(int[] nums) {
		//make first elment in array as highest product
		var maxProduct = nums[0];
		var currentProduct = 1;
		var length = nums.length;

		//run from beginning to end
		for (int i = 0; i < length; i++) {
			currentProduct = currentProduct * nums[i];
			maxProduct = Math.max(maxProduct, currentProduct);
			//if current elemnt is zero
			//make current product to be one so as to
			//start afresh from the next element if possible
			if (nums[i] == 0) {
				currentProduct = 1;
			}
		}

		//run from end to beginning
		//Doing this because subarrays at the end could have 
		//maximum products. We need to catch these ones too
		currentProduct = 1;
		for (int i = length - 1; i >= 0; i--) {
			currentProduct = currentProduct * nums[i];
			maxProduct = Math.max(maxProduct, currentProduct);
			if (nums[i] == 0) {
				currentProduct = 1;
			}
		}

		return maxProduct;
	}

	public static void main(String[] args) {
		System.out.println(new MaximumProductSubarray().maxProduct(new int[] { 2, -5, -2, -4, 3 }));
		System.out.println(new MaximumProductSubarray().maxProduct(new int[] { 2, 3, -2, 4 }));
		System.out.println(new MaximumProductSubarray().maxProduct(new int[] { 0 }));
		System.out.println(new MaximumProductSubarray().maxProduct(new int[] { 0, 0, 0, -2 }));
		System.out.println(new MaximumProductSubarray().maxProduct(new int[] { 0, 0, 0, -2, 0 }));
		System.out.println(new MaximumProductSubarray().maxProduct(new int[] { 2, 0 }));
		System.out.println(new MaximumProductSubarray().maxProduct(new int[] { -2, 0 }));
		System.out.println(new MaximumProductSubarray().maxProduct(new int[] { 0, 2 }));
		System.out.println(new MaximumProductSubarray().maxProduct(new int[] { 0, -2 }));
		System.out.println(new MaximumProductSubarray().maxProduct(new int[] { -3, 0, 1, -2 }));
		System.out.println(new MaximumProductSubarray().maxProduct(new int[] { -2, 0, -1 }));
		System.out.println(new MaximumProductSubarray().maxProduct(new int[] { 0,3,-1 }));
	}

}

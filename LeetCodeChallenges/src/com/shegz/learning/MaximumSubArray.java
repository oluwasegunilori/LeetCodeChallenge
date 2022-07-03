package com.shegz.learning;

public class MaximumSubArray {

	public int maxSubArray(int[] nums) {
		var maxSum = nums[0];
		//starting with the first number in the index as the 
		//max currentSum
		var currentSum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			//Checks the current sum is negative
			//Then it will decrease the current sum
			//when added to the next item. So current sum is best reset to zero
			if(currentSum <0) {
				currentSum = 0;
			}
			
			
			//adds current sum to number at this index
			currentSum = currentSum + nums[i];
			
			//If currentsum > stored maxSum
			//then make maxSum equal to current sum
			if (currentSum > maxSum) {
			
				maxSum = currentSum;
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {
		System.out.println(new MaximumSubArray().maxSubArray(new int[] {-2,1}));
	}

}

package com.shegz.learning;

public class SortColors {

	public void sortColors(int[] nums) {
		var end = nums.length - 1;
		var begin = 0;
		var i = 0;
		while (i <= end) {
			if (nums[i] == 2) {
				//I want to swap all array items with 2 to the relative end of the list
				nums[i] = nums[end];
				nums[end] = 2;
				//Reduce end of the list by 1 since we are moving the same numbers to the
				//right side
				end--;
			} else if (nums[i] == 0) {
				//I want to swap all array items with 0 to the relative start of the list
				nums[i] = nums[begin];
				nums[begin] = 0;
				// Increase begin by 1 since the first element is already zero
				begin++;
				i++;

			} else {
				//Reaches this stage when entry is 1 and this automatically moves 1s to the middle
				//after full iteration
				i++;
			}
		}

		var k = 0;
		while (k < nums.length) {
			System.out.print(nums[k]);
			k++;
		}
	}

	public static void main(String[] args) {
		new SortColors().sortColors(new int[] { 2, 0, 1});
	}
}

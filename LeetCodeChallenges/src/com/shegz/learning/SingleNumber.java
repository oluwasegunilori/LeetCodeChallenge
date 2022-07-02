package com.shegz.learning;

public class SingleNumber {

	
	public int singleNumber(int[] nums) {
        var number = 0;
        var count = 0;
		for (int i = 0; i<nums.length; i++) {
			number = nums[i];
			count = 0;
			for (int j= 0; j<nums.length; j++ ) {
				if(number == nums[j]) {
					count ++;
				}				
			}
			if(count == 1) {
				break;
			}
		}
		return number;
    }
	
	public static void main(String[] args) {
		System.out.print(new SingleNumber().singleNumber(new int[] {4,4,3,22,3,2,3,2}));

	}

}

package com.shegz.learning;

public class CanJump {

	public boolean canJump(int[] nums) {
		var maxReachable = 0;
		var end = nums.length;

		for (int i = 0; i < end; i++) {

			//Checks if current number at index plus current index is greater
			//than maxReachable index
			//Check is necessary so as to increase maxReachable index if necessary
			if (nums[i] + i > maxReachable) {
				maxReachable = nums[i]+i;
			}
			
			//Break loop and return true if maxReachable index is greater
			//than or equal to last index
			//Check is necessary so as not waste time in looping unnecessarily
			if (maxReachable >= end - 1) {
				return true;
			}
			//If we ever get to a point in which the 
			//already above checks do not match and the current item at the 
			// maxReachable index is zero then return false
			//Check is necessary because maxReachable can no longer be
			//increased
			if(i == maxReachable && nums[i] == 0) {
				return false;
			}


		}
		return false;
	}

	public static void main(String[] args) {
		System.out.print(new CanJump().canJump(new int[] {0}));
	}

}

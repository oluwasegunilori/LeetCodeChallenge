package com.shegz.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	List<List<Integer>> threeSum(int[] nums){
		
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		var numsLength = nums.length;
		Arrays.sort(nums);
		for(int a = 0; a< numsLength; a++) {
			if(a ==0 || (a-1 >=0 && nums[a-1] != nums[a])) {
				var target = -nums[a];
				var begin = a+1;
				var end = numsLength-1;
				for(int i = begin; i< end; i++) {
					if(i-1>=begin && nums[i-1] == nums[i]) {
						continue;
					}		
					if(end +1 <= numsLength-1 && nums[end+1] == nums[end]) {
						end--;
						i--;
						continue;
					}
					
					if(nums[i] + nums[end] < target) {
						continue;
					}
					else if(nums[i]+ nums[end] > target) {
						end--;
						i--;
						continue;
					}
					else {
						list.add(Arrays.asList(nums[a], nums[i], nums[end]));						
					}
				}		
			}
			
		}
		return list;
	}
	
	public static void main(String[] args) {
		//test cases
		System.out.print(new ThreeSum().threeSum(new int[] {-1,0,1,2,-1,-1,-4}));
		System.out.print(new ThreeSum().threeSum(new int[] {0,0,0,0}));
	}

}

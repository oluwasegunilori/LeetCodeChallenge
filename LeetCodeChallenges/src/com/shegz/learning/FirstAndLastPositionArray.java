package com.shegz.learning;

public class FirstAndLastPositionArray {

	public int[] searchRange(int[] nums, int target) {
		var answer = new int[] { findFirst(nums, target), findLast(nums, target) };
		return answer;
	}

	int findFirst(int[] nums, int target) {
		int start = 0, end = nums.length - 1, first = -1;
		for (int i = start; i <= end; i++) {
			// find the target at smallest position
			// start from the middle until target is first found
			var mid = (i + start) / 2;
			//if middle item is greater than target
			//move to the left by equating end to index before mid
			
			if (nums[mid] > target) {
				end = mid - 1;
				i--;
			} 
			//if middle item is less than target
			//move to the right by equating start to index after mid

			else if (nums[mid] < target) {
				start = mid + 1;
			} 
			//If code gets here then we have found item 
			// then move end to index before mid reason is that
			// we are looking for first occurrence so we have to keep moving to the left
			else {
				first = mid;	
				end = mid -1;
			}
		}

		return first;
	}

	int findLast(int[] nums, int target) {
		int start = 0, end = nums.length - 1, last = -1;
		for (int i = start; i <= end; i++) {
			// find the target at largest position
			// start from the middle until target is first found

			var mid = (i + start) / 2;
			
			//if middle item is greater than target
			//move to the left by equating end to index before mid
			if (nums[mid] > target) {
				end = mid - 1;
				i--;
			} 
			//if middle item is less than target
			//move to the right by equating start to index after mid
			else if (nums[mid] < target) {
				start = mid + 1;
				//If code gets here then we have found item 
				// then move end to index before mid reason is that
				// we are looking for last occurrence so we have to keep moving to the right
			} else {
				last = mid;		
				start = mid + 1;
				if(mid+1>=nums.length)
					break;

			}
		}

		return last;
	}

	public static void main(String[] args) {
		//Tests
		var answer = new FirstAndLastPositionArray().searchRange(new int[] {2,2},2);
		System.out.println(answer[0]);
		System.out.println(answer[1]);
	}

}

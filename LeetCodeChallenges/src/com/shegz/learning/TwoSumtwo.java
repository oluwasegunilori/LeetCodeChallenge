package com.shegz.learning;

public class TwoSumtwo {

	public int[] twoSum(int[] numbers, int target) {
		var arrayToReturn = new int[2];
		int end = numbers.length -1;
		
		for(int i = 0; i<= end; i++) {
			
			if(numbers[i] + numbers[end] > target) {
				i--;
				end--;
				continue;
			}
			
			else if(numbers[i] + numbers[end] < target) {
				continue;
			}
			else {
				arrayToReturn[0] = i+1;
				arrayToReturn[1] = end+1;
				break;				
			}
			
			
		}
		
		return arrayToReturn;
	}
	
	public static void main(String[] args) {
		System.out.println(new TwoSumtwo().twoSum(new int[] {-1,0}, -1));
	}

}

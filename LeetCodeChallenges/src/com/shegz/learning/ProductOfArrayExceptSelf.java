package com.shegz.learning;

public class ProductOfArrayExceptSelf {

	public int[] productExceptSelf(int[] nums) {	
		//Get length of array.
		var length = nums.length;
		//If there is only one item then return the array
		if(length == 1) {
			return nums;
		}
		
		//create a left array with same length as input array
		//this gives us products of all elements from start up to the items at each index
		//excluding that item
		// so for array[2,4,6,8]
		// left array = [1,2,(4*2), (2*4*6)]
		var left = new int[length];
		// create a right array with same length as input array
		//this gives us products of all elements from end down to the items at each index
		//excluding that item
		// so for array[2,4,6,8]
		// left array = [(4*6*8),(6*8),(8), 1]
		var right = new int[length];
		// create array to store the computed products
		// the product of each item at each index in the left and right array
		// gives the the product of array except the item at that index
		var product = new int[length];

		//initialize the first element in the left array to be 1
		// This is done because the first element in the right array 
		// already covers for the product
		left[0] = 1;
		
		//initialize the last element in the right array to be 1	
		// This is done because the last element in the right array 
		// already covers for the product
		right[length-1] = 1;
		
		//traverse array from second element to end with left array
		//traverse array from second to the last element to start in the right array 
		for (int i = 1; i < length; i++) {
			left[i] = nums[i-1] * left[i-1];
			right[length-(i+1)] = nums[length-i] * right[length-i];
		}
		
		//get the elements in the product
		for (int i = 0; i < length; i++) {
			product[i] = left[i] * right[i];
		}
			
		return product;
	}

	public static void main(String[] args) {
		//test cases
		System.out.println(new ProductOfArrayExceptSelf().productExceptSelf(new int[] {1,2,3,4}));
		System.out.println(new ProductOfArrayExceptSelf().productExceptSelf(new int[] {-1,1,0,-3,3}));
	}

}

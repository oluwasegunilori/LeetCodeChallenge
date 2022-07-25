/**
 * 
 */
package com.shegz.learning;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author oluwasegun
 *
 */
public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
        var result = new int[2];
        //use hashmap to save key value pairs
        // key is the item in the array
        // value is the index of item in the array
        var hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i<=nums.length-1; i++){
        		//get array Index with value which is target - current item
                var remainingIndex = hashMap.get(target - nums[i]);
                //if remainingIndex is not null then we have reached our answer
                // since we can get the index where the item at the index sums up
                // it the current item nums[i] to give th targe
                if(remainingIndex != null && remainingIndex != i){
                    result[0] = remainingIndex;
                    result[1] = i;
                    break;
                }
                else{
                	// saves item as key with value as array index
                    hashMap.put(nums[i],i);
                }
        }
        
        return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Test cases
		System.out.println(Arrays.toString(new TwoSum().twoSum(new int[] { 2, 7, 11, 15 }, 9)));
		System.out.println(Arrays.toString(new TwoSum().twoSum(new int[] { 2, 7, 11, 15 }, 26)));
		System.out.println(Arrays.toString(new TwoSum().twoSum(new int[] { 2, 7, 11, 15 }, 22)));
		System.out.println(Arrays.toString(new TwoSum().twoSum(new int[] { 3, 2, 4 }, 6)));
	}

}

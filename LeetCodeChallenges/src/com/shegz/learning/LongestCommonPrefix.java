package com.shegz.learning;


public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) {
		var lcPrefix = "";
		var strslength = strs.length;
		var firstStrs = strs[0];
		if(firstStrs.length() == 0) {
			return lcPrefix;
		}
		var firstStrsChars = firstStrs.split("");
		var firstStrsCharsLenth = firstStrsChars.length;
		
		
	
		for(int i = 0; i< firstStrsCharsLenth; i++) {
			
			var stringToCheck = lcPrefix+firstStrs.charAt(i);
			
			var isPresent = true;
			for(int j = 0; j<strslength;j++) {
				if(!strs[j].startsWith(stringToCheck)) {
					isPresent = false;
					break;
				}
			}
			if(isPresent){
				lcPrefix = stringToCheck;
			}
		}
		
		
		return lcPrefix;
		
	}
	
	public static void main (String[] args) {
		System.out.println(longestCommonPrefix(new String[] {"flower","flow","flight"}));
	}
}

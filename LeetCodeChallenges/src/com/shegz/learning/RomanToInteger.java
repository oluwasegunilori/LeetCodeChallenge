package com.shegz.learning;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {	
	
	
	
	public static int romanToInt(String s) {
		Map<String, Integer> romanMap = new HashMap<String, Integer>();
		romanMap.put("I", 1);
		romanMap.put("V", 5);
		romanMap.put("X", 10);
		romanMap.put("L", 50);
		romanMap.put("C", 100);
		romanMap.put("D", 500);
		romanMap.put("M", 1000);
		
		String[] splittedStrings = s.split("");
		
		int romanValue = 0;
		int lengthOfStrings = splittedStrings.length;
		for(int i = 0; i<lengthOfStrings; i++) {
			
			if(lengthOfStrings -i ==1) {
				romanValue += romanMap.get(splittedStrings[i]);				
			}
			else {
				int currentCharValue = romanMap.get(splittedStrings[i]);
				int nextCharValue = romanMap.get(splittedStrings[i+1]);
				if(lengthOfStrings > i+2) {
					int afterNextCharValue = romanMap.get(splittedStrings[i+2]);
					if(afterNextCharValue > nextCharValue) {
						nextCharValue = afterNextCharValue-nextCharValue;
						i++;
					}
					
				}
				
				
				if(currentCharValue < nextCharValue) {
					romanValue += nextCharValue - currentCharValue;
				}
				else {
					romanValue += currentCharValue+ nextCharValue;
				}
				i++;
			}
			 
		}
		
		return romanValue;
		
	}
	
	
	public static void main (String[] args) {
		
		System.out.print(romanToInt("MCM"));
	}
	
}

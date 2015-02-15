package com.test;

import java.util.HashMap;
import java.util.Map;

public class FindindDuplicateCharsInString {
	public static void main(String[] args) {
		String str="abcabcd";
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		char[] charArray=str.toCharArray();
		
		for(char chValue: charArray){
			if(Character.isAlphabetic(chValue)){
				if(map.containsKey(chValue)){
					map.put(chValue, map.get(chValue)+1);
					//map.remove(charArray);
				}else{
					map.put(chValue, 1);
				}
			}
		}
		System.out.println("Character count is : "+map);
	}
}

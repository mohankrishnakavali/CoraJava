package com.cognizant;

import java.util.HashMap;
import java.util.Map;

public class FindingDuplicateCharactors {

	public static void main(String[] args) {
		String str="abcabcdefdesmokjljggffdfdf";
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		char[] ch=str.toCharArray();
		for(char c:ch){
			if(Character.isAlphabetic(c)){
				if(map.containsKey(c)){
					map.put(c,map.get(c)+1);
				}else{
					map.put(c, 1);
				}
			}
		}
		System.out.println("map values is : "+map);
		
	}
	
	
	//wrong approch
	/*public static void main(String[] args) {
		String str="aaabbbdefccc";
		int stringLength=str.length();
		for(int i=0;i<stringLength;i++){
			char ch=str.charAt(i);
			if(ch==str.charAt(i))
			{
				System.out.println("Duplicate charactor is : "+ch);
			}
		}
	}*/

}

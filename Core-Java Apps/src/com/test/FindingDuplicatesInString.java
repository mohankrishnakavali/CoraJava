package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindingDuplicatesInString {

	public static void main(String[] args) {
		//String str="munisekhar bathala";
		Scanner sc=new Scanner(System.in);
		System.out.print("Please Enter String value : ");
		String str=sc.next();
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		char[] characters=str.toCharArray();
		
		for(char ch: characters){
			if(Character.isAlphabetic(ch)){
				if(map.containsKey(ch)){
					map.put(ch, map.get(ch)+1);
				}else{
					map.put(ch, 1);
				}
			}
		}
		System.out.println("Map values is : "+map);
	}

}

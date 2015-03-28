package com.test;

import java.util.HashSet;
import java.util.Set;

public class Duplicates {
	public static void main(String[] args) {
		int[] numbers={9,1,1,4,5,6,6,8,9};
		Set<Integer> set=new HashSet<Integer>();
		
		for(int i=0;i<numbers.length;i++){
			if(set.add(numbers[i])==false){
				System.out.println("Duplicate Element Found : "+numbers[i]);
			}
		}
		
	}
}

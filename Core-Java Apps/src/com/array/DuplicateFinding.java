package com.array;

public class DuplicateFinding {
	public static void main(String[] args) {
		int[] array={10,11,11,16,26};
		boolean duplicates=false;
		for (int j=0;j<array.length;j++){
		  for (int k=j+1;k<array.length;k++){
		    if (k!=j && array[k] == array[j])
		      duplicates=true;
		  }
		}
		System.out.println("Duplicate element is "+duplicates);
	}
}

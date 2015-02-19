package com.cognizant;

public class DuplicateInArray {

	public static void main(String[] args) {
		//int j=0;
		int[] tempArray = { 1, 2, 3, 4, 5, 6, 6, 7, 8, 8, 9 };
		for (int i = 0; i < tempArray.length; i++) {
			int j=tempArray[i];
			if(j==i){
				System.out.println("Duplicate Element is : "+j);
			}
		}
	}

}

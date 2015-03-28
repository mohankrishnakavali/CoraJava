package com.array;

public class HighestNumber {
	public static void main(String[] args) {
		int[] array=new int[]{10,11,15,19,20,90909,98989};
		
		int highestNumber=array[0];
		int smallNumber=array[0];
		int secondHighestNumber=array[0];
		
		for(int i: array){
			if(i>highestNumber){
				highestNumber=i;
			}
		}
		System.out.println("Highest Number is : "+highestNumber);
		//System.out.println("Small Number is : "+smallNumber);
		System.out.println("Second Highest Number is : "+secondHighestNumber);
	}
}

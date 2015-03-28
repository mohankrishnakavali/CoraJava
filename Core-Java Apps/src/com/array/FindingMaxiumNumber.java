package com.array;

public class FindingMaxiumNumber {

	public static void main(String[] args) {
			int[] numbers={10,55,11,12,12,15,19,19};
			int smallest=numbers[0];
			int highest=numbers[0];
			int secondHighest=numbers[0];
			for(int i : numbers){
				//System.out.println(i);
				if(i>highest){
					highest=i;
				}else if(i>secondHighest && i!=highest){
					secondHighest=i;
				}
				else if(i<smallest){
					smallest=i;
				}
			}
			System.out.println("Highest Number is : "+highest);
			System.out.println("Smallest Number is : "+smallest);
			System.out.println("Second Highest Number is : "+secondHighest);
	}

}

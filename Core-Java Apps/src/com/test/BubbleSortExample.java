package com.test;

import java.util.Arrays;

public class BubbleSortExample {
/*	public static void bubbleSort(int[] num){
		int j,temp;
		boolean flag=true;
		
		while(flag){
			flag=false;
			for(j=0;j<num.length-1;j++){
				if(num[j]<num[j+1]){
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
					flag=true;
				}
				System.out.println(num[j]);
				
			}
		}
	}
	public static void main(String[] args) {
		int[] a={10,11,12,9,8,8,9};
		bubbleSort(a);
	}*/
	
	public static void main(String[] args) {
		int[] numbers = { 5, 8, 14, 1, 5678 };
		Arrays.sort(numbers);
		int tempVar;
		for (int i = 0; i < numbers.length; i++)
		{
		       for(int j = 0; j < numbers.length; j++)
		       {
		                if(numbers[i] < numbers[j + 1])
		                {
		                       tempVar = numbers [j + 1];
		                       numbers [j + 1]= numbers [i];
		                       numbers [i] = tempVar;
		                }
		       }
		}
		for (int i = 0; i < numbers.length; i++)
		{
		         System.out.println(numbers[i]);
		}
	}
}

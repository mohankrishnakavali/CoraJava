package com.cognizant;

public class FibonacciSeries {

	public static void main(String[] args) {
		int f1, f2 = 0, f3 = 1, num = 100;
		
		for(int i=0;i<=100;i++){
			System.out.print(" " + f3 + " ");
			f1=f2;
			f2=f3;
			f3=f1+f2;
		}
	}

}

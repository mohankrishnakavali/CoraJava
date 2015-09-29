package corejava.practiceprograms;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println("Please enter number to be reverse : ");
		@SuppressWarnings("resource")
		int number=new Scanner(System.in).nextInt();
		int reverse=reverse(number);
		System.out.println("Reversed Number : "+reverse);
	}

	private static int reverse(int number) {
		int reverse =0;
		int reminder=0;
		
		do{
			reminder =number%10;
			reverse=reverse*10 +reminder;
			number=number/10;
		}while(number>0);
		
		return reverse;
	}
}

package com.test;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[]) {
	int n, i, res;
	boolean flag=true;
	Scanner sc=new Scanner(System.in);
	System.out.print("Please enter number : ");
	n=sc.nextInt();
	for(i=2;i<=n/2;i++){
		res=n%i;
		if(res==0){
			flag=false;
		}else{
			flag=true;
		}
	}
	
	if(flag){
		System.out.println(n+"  Prime number");
	}else{
		System.out.println(n+"  not prime number");
	}
	
	}	
	/*public static void main(String args[])
	{		
		int n, i, res;
		boolean flag=true;
		Scanner scan= new Scanner(System.in);
		System.out.println("Please Enter a No.");
		n=scan.nextInt();
		for(i=2;i<=n/2;i++)
		{
			res=n%i;
			if(res==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println(n + " is Prime Number");
		else
			System.out.println(n + " is not Prime Number");
	}*/
}

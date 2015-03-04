package com.test;

public class ArraySorting {
	
	public static int[] merge(int[] a,int[] b){
		int[] answer=new int[a.length+b.length];
		int i=0,j=0,k=0;
		
		while(i<a.length &&j<b.length){
			if(a[i]<b[j]){
				answer[k++]=a[i++];
			}else
				answer[k++]=b[j++];
		}
		
		while(i<a.length){
			answer[k++]=a[j++];
		}
		while(j<b.length){
			answer[k++]=b[j++];
		}
		return answer;
	}
	public static void main(String[] args) {
		int[] i={1,2,3,5,7,4,3,1};
		int[] j={10,8,7,5,7,4,3,1};
		int[] a=merge(i, j);
		for(int b: a){
			System.out.println(b);
		}
		
	}
}

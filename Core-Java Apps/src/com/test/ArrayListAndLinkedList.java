package com.test;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListAndLinkedList {
	

	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		LinkedList<Integer> linkedList=new LinkedList<Integer>();
		
		for(int i=-3; i<=3;i++){
			arrayList.add(i);
			linkedList.add(i);
		}
		System.out.println("Before removing" +arrayList +"   "+linkedList);
		for(int i=0;i<=3;i++){
			arrayList.remove(i);
			//linkedList.remove(i);
		}
		System.out.println("After removing"+ arrayList);
		//System.out.println(arrayList +"----"+linkedList);
			
	}
}

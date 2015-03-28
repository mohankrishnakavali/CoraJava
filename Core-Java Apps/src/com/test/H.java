package com.test;

class I{
	private int x;
	
	void set(int y,int z){
		z=y;
		x=z;
	}
	int get(){
		return x;
	}
}

public class H  {
	public static void main(String[] args) {
		I i=new I();
		System.out.println(i.get());
		i.set(90, 50);
		System.out.println(i.get());
	}
}

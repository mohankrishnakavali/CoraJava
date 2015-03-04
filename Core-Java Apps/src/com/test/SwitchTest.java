package com.test;

class X{
	public void test(){
		System.out.println("HI");
	}
}

public class SwitchTest extends X{
	public void test(){
		System.out.println("KKKK");
	}
	void main(){
		
	}
	
	public static void main(String[] args) {
		/*X x=new SwitchTest();
		x.test();
		System.out.println(14 ^ 23);*/
		String s="ABC";
		s.toLowerCase();
		s+="DEF";
		System.out.println(s);
		
		
		
		int i=4;
		int j=3;
		int k=2;
		
		for(;j<7;j++){
			if(k++ >i){
				i=j+k;
			}
		}
		System.out.println(k);
		
	}
}

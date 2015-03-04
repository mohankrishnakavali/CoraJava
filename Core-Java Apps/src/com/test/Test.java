package com.test;

class Test4 {
	public int value;
	public int hashCode(){
		return 42;
	}
}
class Test5{
	public int value;
	public int hashCode(){
		return (int)(value^5);
	}
}

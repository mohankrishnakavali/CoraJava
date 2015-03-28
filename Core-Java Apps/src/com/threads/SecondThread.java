package com.threads;

public class SecondThread extends Thread{
	MyProcess process1;
	MyProcess process2;
	
	public SecondThread(MyProcess process1,MyProcess process2) {
		this.process1=process1;
		this.process2=process2;
	}
	
	public void run(){
		process2.method2(process1);
	}
	
}

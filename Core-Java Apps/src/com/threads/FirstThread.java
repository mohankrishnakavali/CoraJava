package com.threads;

public class FirstThread extends Thread {
	MyProcess process1;
	MyProcess process2;
	
	public FirstThread(MyProcess process1,MyProcess process2) {
		this.process1=process1;
		this.process2=process2;
	}
	public void run(){
		process1.method1(process2);
	}
}

package com.threads;

public class MyProcess {
	public synchronized void method1(MyProcess process1){
		for(int i=0;i<50;i++){
		System.out.println("I am in My Process class method 1" +i);
		System.out.println(Thread.currentThread().getName());
		}
	}
	public synchronized void method2(MyProcess process2){
		for(int i=0;i<50;i++){
		System.out.println("I am in My Process class method 2" + i);
		System.out.println(Thread.currentThread().getName());
		}
	}
}


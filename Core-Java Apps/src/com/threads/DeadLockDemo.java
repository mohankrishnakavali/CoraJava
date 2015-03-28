package com.threads;

public class DeadLockDemo {
	public static void main(String[] args) {
		MyProcess process1=new MyProcess();
		MyProcess process2=new MyProcess();
		
		FirstThread ft=new FirstThread(process1, process2);
		SecondThread st=new SecondThread(process1, process2);
		
		ft.setName("First Thread");
		ft.start();
		
		st.setName("Second Thread");
		st.start();
		
	}
}

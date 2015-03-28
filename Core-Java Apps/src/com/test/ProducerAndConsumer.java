package com.test;

public class ProducerAndConsumer {
	
}
class CubbyHole{
	private int contents;
	private boolean available=false;
	
	public synchronized int get(){
			while(available==false){
				try{
					wait();
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
			available =false;
			notifyAll();
		return contents;
	}
	public synchronized void put(int value){
		while(available==true){
			try{
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		contents=value;
		available =true;
		notifyAll();
	}
}
class Consumer extends Thread{
	private CubbyHole ch;
	private int number;
	
	public Consumer(CubbyHole c, int n){
		this.ch=c;
		this.number=n;
	}
	public void run(){
		
	}
}
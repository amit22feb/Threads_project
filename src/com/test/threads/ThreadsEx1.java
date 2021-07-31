package com.test.threads;

public class ThreadsEx1{

	public static void main(String[] args) {
	
		Thread t1 = new Thread(new MyThread("Thread-1"));
		Thread t2 = new Thread(new MyThread("Thread-2"));
		t1.start();
		t2.start();
		for(int i=0;i<5;i++){
			System.out.println("Main thread: "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}

class MyThread implements Runnable{

	private String threadName;
	public MyThread(String threaName) {
		this.threadName = threaName;
		System.out.println("Creating: "+ threaName);
	}	
	
	@Override
	public void run() {
		System.out.println("Running "+ threadName);
		
		for(int i=0;i<4;i++){
			System.out.println("Thread: "+threadName+" ,"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Thread "+threadName+" interrupted");
			}
		}
		System.out.println("Thread "+threadName+" exitting");
	}
	
	public void showName(){
		System.out.println("Thread");
	}
	
}

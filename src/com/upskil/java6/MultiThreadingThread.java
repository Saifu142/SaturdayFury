package com.upskil.java6;

public class MultiThreadingThread extends Thread{
	
	public void run() {
	
	try {
		System.out.println(Thread.currentThread().getId());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}

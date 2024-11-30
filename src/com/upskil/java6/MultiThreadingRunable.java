package com.upskil.java6;

public class MultiThreadingRunable implements Runnable{
	
	@Override
	public void run() {
		try {
		System.out.println(Thread.currentThread().getId());
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}

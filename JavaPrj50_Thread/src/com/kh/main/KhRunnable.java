package com.kh.main;

public class KhRunnable implements Runnable{
	
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		t.setName("노예 1호");
		String name = t.getName();
		System.out.print("[" + name + "] ");
		System.out.println("내가만든 러너~~~");
	
	}

}

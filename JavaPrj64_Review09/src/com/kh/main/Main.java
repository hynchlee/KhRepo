package com.kh.main;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("======쓰레드======");
		
		//여러 작업을 동시에 처리하기 위해 사용
		
		//쓰레드 생성 하고 업무지시
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("run호출됨");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		
		
	}

}

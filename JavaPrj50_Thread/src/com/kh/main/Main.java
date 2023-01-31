package com.kh.main;

public class Main {

	public static void main(String[] args) {

		System.out.println("========쓰레드========");

		// KhRunnable객체 생성(새로운 클래스 생성)
		// 신입 쓰레드에 할일 부여
		Runnable m = new Runnable() {

			@Override
			public void run() {
				System.out.println("신규업무시작");
				
				//현재 쓰레드 3초 재우기
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					System.out.println("쓰레드 자는데 누가 방해함 그래서 예외 발생");
					e.printStackTrace();
				}

				Thread t = Thread.currentThread();
//				t.setName("노예");
				String name = t.getName();

				for (int i = 1; i < 11; i++) {
					System.out.println("[" + name + "] " + i);
				}
				System.out.println("신규업무종료");

			}
		};
		
		// 쓰레드 생성 및 m의 업무 지시
//		Thread t01 = new Thread(m);
		Thread t01 = new Thread(() -> {System.out.println("람다식으로 만든 함수");});
		t01.start();

		// 메인쓰레드가 본인 이름 가져오는 코드
		Thread mt = Thread.currentThread();
		String name = mt.getName();

		// 메인 쓰레드
		for (int i = 1; i < 11; i++) {
			System.out.print("[" + name + "] ");
			System.out.println(i);
		}
		
		
		t01.interrupt();	// 메인쓰레드의 일을 끝내고 t01(신입쓰레드)를 깨움 (예외 발생)
		
//		t01.run();	//메인쓰레드가 run 메소드를 실행하러 감
		

		
	}

}

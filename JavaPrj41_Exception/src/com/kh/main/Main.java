package com.kh.main;

public class Main {

	public static void main(String[] args) {

		System.out.println("=====메인메소드 시작=======");

//		new Test().m01();
		Test t1 = new Test();

//		try {
//			t1.m01();
//			t1.m02(10,0);
//			t1.m03(null);
//			t1.m04(null);
//			t1.m05();
//		} catch (Exception e) {
//			System.out.println("예외 발생 m05메소드가 나한테 던짐");
//		}
		try {
			t1.m06();
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("=====메인메소드 종료=======");

	}

}

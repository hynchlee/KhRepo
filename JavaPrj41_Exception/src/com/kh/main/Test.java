package com.kh.main;

import java.io.IOException;

public class Test {

	public void m01() {

		System.out.println("m01 시작");

//		System.out.println(1/0);	//예외 발생
//		String str = null;
//		
//		System.out.println(str.charAt(5));	//str객체에 접근하여 특정 문자 호출
		// null point exception 발생

//		int[]arr = new int[3];
//		arr[5] = 777;	//만들어진 arr배열의 범위내에 없어서 예외 발생

		System.out.println("m01 종료");

	}

	public void m02(int a, int b) {
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("내가 잡은 예외 " + e);
		}

	}

	public void m03(String str) {

		try {
			System.out.println(str.charAt(5));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("내가 잡은 예외 " + e);
		} catch (NullPointerException e) {
			System.out.println("내가 잡은 예외 " + e);
		}

	}

	public void m04(String s) {

		try {
			char x = s.charAt(3);
			System.out.println(x);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	public void m05() throws Exception{
		System.out.println("m05 시작");
		int x = 1/0;
		System.out.println("m05 종료");
	}
	
	public void m06() throws Exception{
		System.out.println("m06시작");
		
		//예외 강제로 발생
		throw new Exception("나와라 얍");	// 예외를 던지는데 m06에서 throw를 하여 메인으로 넘어간다.
		
//		System.out.println("m06종료");
	}

}

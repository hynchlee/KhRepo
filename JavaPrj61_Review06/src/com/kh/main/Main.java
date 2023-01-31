package com.kh.main;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("======예외======");
		
		//예외 ? 예외적인 상황 ==> 오류
		
		//컴파일 vs 런타임
		
		//예외 처리 방법 : 잡기 vs 던지기
		
		//예외 직접 발생 : throw 예외 객체
		//new Exception
		
		try {
			int x = 1 / 0;
			System.out.println(x);
		} catch (Exception e) {
			System.out.println("예외발생");
			e.printStackTrace();
		}
		
		
		
	}

}

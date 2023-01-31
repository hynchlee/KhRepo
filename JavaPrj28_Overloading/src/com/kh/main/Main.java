package com.kh.main;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {

		System.out.println("mian");

		// 문자열 비교 A.equals(B)
//		String s1 = "hello";
//		String s2 = "hello";
//		System.out.println(s1.equals(s2));

//		System.out.println(s1.length());
	
		System.out.println("오버로딩 테스트~~");
		
		Test t = new Test();
		t.printText("9시 32분");
		t.printText("9시 33분");
		t.printText("aaa","bbb");
		
		
	
	}

}

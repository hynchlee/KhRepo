package com.kh.overtest;

public class OverloadingTest {

	void cat() {
		System.out.println("매개변수 없음");
	}

	void cat(int a, int b) {
		System.out.println("매개변수 : " + a + "," + b);
	}

	void cat(String c) {
		System.out.println("매개변수 : " + c);
	}
}

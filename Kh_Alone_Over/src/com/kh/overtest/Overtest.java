package com.kh.overtest;

public class Overtest {

	public static void main(String[] args) {
		
		System.out.println("안녕하세요");
		
		OverloadingTest ot = new OverloadingTest();
		
		ot.cat();
		ot.cat(2,3);
		ot.cat("삼겹");
	}
	
}

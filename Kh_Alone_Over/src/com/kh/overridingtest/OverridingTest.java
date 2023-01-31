package com.kh.overridingtest;

public class OverridingTest {

	public static void main(String[] args) {
		
		Job job = new Job();
		
		// 부모 클래스를 상속받았으므로 자식클래스 내 별도 선언 없이 부모클래스 내 멤버변수에 접근 가능
		job.name = "유리";
		job.age = 20;
		job.job = "프로게이머";
		
		job.info();		
	}
	
}

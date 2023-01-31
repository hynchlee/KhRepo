package com.kh.main;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("클래스와 객체");
		
		Student s = new Student();
		s.setName("홍길동");
		s.setScore(100);

		System.out.println(s);
	}

}

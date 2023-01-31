package com.kh.person;

public class Person {
	
	//멤버변수 == 필드
	private String name;
	private int age;
	
	//멤버메소드 == 객체메소드 == 인스턴스메소드
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
}

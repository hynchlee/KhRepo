package com.kh.animal;

public class Dog {

	private String name;
	private int age;
	
	public void cry() {
		System.out.println("멍멍");
	}
	
	public String toString() {
		return "이름은 " + name + "이고, 나이는 " + age + "개월 입니다."; 
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}

}

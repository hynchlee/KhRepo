package com.kh.animal;

public class Dog {
	
	private String name;
	private int age;

	public void setName(String n) {
		this.name = n;
	}
	
	public String getName() {
		String name = "ㅇ";	// 같은 지역 안에 같은 변수가 있기 때문에 this를 선언해주어야 한다.
		return this.name;
	}
	
	public void setAge(int a) {
		this.age = a;
	}
	
	public String toString/* toString은 직접 호출하지 않고 default로도 가능 */() {
		return "이름은 " + name + ", 나이는 " + age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void cry() {
		System.out.println("멍멍");
	}
	
	
	
	
}

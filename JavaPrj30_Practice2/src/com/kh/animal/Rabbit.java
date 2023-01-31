package com.kh.animal;

public class Rabbit {
	
	private String name;
	private int age;
	
	//기본 생성자
	public Rabbit() {
		
	}
	
	//파라미터가 있는 생성자
	public Rabbit(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//getter, setter 만들기
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName(String name) {
		return name; 
	}
	
	public int getAge(int age) {
		return age;
	}
	
	public String toString() {
		return "이름은 " + name + "이고, 나이는 " + age + "개월 입니다.";
	}

}

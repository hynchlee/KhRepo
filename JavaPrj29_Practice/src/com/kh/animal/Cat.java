package com.kh.animal;

public class Cat {
	
	private String name;
	private int age;
	
	public void setName(String n) {
		this.name = n;
	}
	
	public String toString() {
		return name;
	}
	
	public void setAge(int a) {
		this.age = a;
	}
	
	public int getAge() {
		return age;
	}
	
	public void jump() {
		System.out.println("고양이 점프");
	}

}

package com.kh.main;

public class Person {

	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if (this.age < age) {
			this.age = age;
		}else {
			System.out.println("값 확인 하셈");
		}

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age-1;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
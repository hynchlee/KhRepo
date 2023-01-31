package com.kh.animal;

public class Cat extends Animal {

	public String name;
	
	public void cry() {
		System.out.println("야옹야옹");
	}

	public String getName() {
		return super.name;
	}

	public void setName(String name) {
		super.name = name;
	}

}

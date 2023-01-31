package com.kh.animal;

public abstract class Animal {

	private String name;
	private int age;
	
	public void eat() {
		System.out.println("밥 먹음");
	}
	
	public abstract void cry();
	
}

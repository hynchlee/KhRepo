package com.kh.animal;

public class Cat extends Animal {

	//메소드 덮어쓰기 == Override 
	@Override
	public void cry() {
		System.out.println("야옹");
	}
	
}

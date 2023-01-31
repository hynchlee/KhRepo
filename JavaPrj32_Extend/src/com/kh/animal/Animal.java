package com.kh.animal;

public abstract class Animal {

	//기본 생성자
//	public Animal() {
//		super();
//	}
	
	//파라미터가 있는 생성자
//	public Animal(String string) {
//		
//	}
	
	public String name = "애니멀 클래스에서 할당한 네임";
	public int age;

	public void eat() {
		System.out.println("밥먹음");
	}
	
	//추상 메소드
	public abstract void cry();

	
}
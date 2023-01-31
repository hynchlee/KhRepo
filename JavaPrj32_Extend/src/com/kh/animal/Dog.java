package com.kh.animal;

public class Dog extends Animal {

	public String name;

	//기본 생성자
	public Dog() {
//		super("zzz");
		//super();	//부모 클래스의 생성자 생성
		//return 객체;
	}
	
	
	@Override
	public void cry() {
		System.out.println("멍멍!");
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

package com.kh.person;

public class Person {

	// 상수 : 항상 같은 값을 가지는 수
	// 대무자로 작성
	// 띄어쓰기는 언더바로 대체
	// final double PI = 3.14;

	// 변수
	private String name;
	private int age;

	// 메소드
	public void introduce() {
		System.out.println("저는 " + name + "이고, " + age + "살 입니다.");
	}// introduce

	public void setName(String name) {
		this.name = name;
	}// setName

	public void setAge(int age) {
		this.age // Person객체의 age
				= age; // setAge의 age
	}// setAge

	public String getName() {// 저장된 이름을 가져오는 메소드
		return this.name;
	}// getName

	public int getAge() {// 저장된 나이를 가져오는 메소드
		return this.age;
	}// getAge

}// Person

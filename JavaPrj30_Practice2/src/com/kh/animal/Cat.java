package com.kh.animal;

public class Cat {

	private String name;
	private int age;

	// 기본 생성자( == 파라미터 없는 생성자)
	public Cat() {
		// return 객체; //이 코드는 우리 눈에 안보임
	}

	// 파라미터 있는 생성자
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
		// return Cat 객체 -> 이 코드는 우리 눈에 안보임
	}

	public void jump() {
		System.out.println("고양이 점프");
	}

	public String toString() {
		return "이름은 " + name + "이고, 나이는 " + age + "개월 입니다.";
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

}

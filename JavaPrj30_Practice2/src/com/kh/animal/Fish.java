package com.kh.animal;

public class Fish {

	// 필드
	private String name;
	private int age;

	// 기본 생성자
	public Fish() {
		// return 객체 // 눈에 안보임
	}

	// 파라미터가 있는 생성자
	public Fish(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// name getter
	public String getName() {
		return name;
	}

	// name setter
	public void setName(String name) {
		this.name = name;
	}

	// age getter
	public int getAge() {
		return age;
	}

	// age setter
	public void setAge(int age) {
		this.age = age;
	}

	
	public String toString() {
		return "이름은 " + name + "이고, 나이는 " + age + "개월 입니다.";
	}

}

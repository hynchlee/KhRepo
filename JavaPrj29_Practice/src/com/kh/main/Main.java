package com.kh.main;

import com.kh.animal.Cat;
import com.kh.animal.Dog;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("main called..");
		
		Dog dog = new Dog();
		dog.setName("라면 먹고 도망가서 기철이 기영이 라면 못먹게 만든 거지");
		dog.setAge(3);
		
//		System.out.println(dog.getName() + "의 나이는 " + dog.getAge() + "살 입니다");
		System.out.println(dog);
		dog.cry();
		System.out.println();
		
		Cat cat = new Cat();
		cat.setName("똥퍼 아저씨");
		cat.setAge(2);
		
		System.out.println(cat + "의 나이는 " + cat.getAge() + "살 입니다");
		cat.jump();
		
	}

}

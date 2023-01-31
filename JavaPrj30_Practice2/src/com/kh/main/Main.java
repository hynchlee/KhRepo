package com.kh.main;

import com.kh.animal.Cat;
import com.kh.animal.Dog;
import com.kh.animal.Fish;
import com.kh.animal.Rabbit;

public class Main {

	public static void main(String[] args) {

		System.out.println("main called....");

		// 강아지 객체 생성
		Dog d = new Dog();

		// 강아지 정보 출력
		d.setName("길똥이");
		d.setAge(11);
		System.out.println(d);
		d.cry();

		// 고양이 객체 생성
		Cat c = new Cat("야옹이", 1);
		// 고양이 정보 출력
		System.out.println(c);
		c.jump();

		// 물고기 객체 생성
		Fish f = new Fish("자반 고등어", 2);
		// 물고기 정보 출력
		System.out.println(f);

		// 토끼 객체 생성
		Rabbit r = new Rabbit("토꺵이", 11);
		// 토끼 정보 출력
		System.out.println(r);
		
	}

}

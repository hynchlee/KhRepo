package com.kh.main;

import com.kh.animal.Cat;
import com.kh.animal.Dog;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("main called.....");
		
		//강아지 객체 생성
		Dog d = new Dog();
		d.cry();
		
		//고양이 객체 생성
		Cat c = new Cat();
		c.cry();
		
	}
	
}

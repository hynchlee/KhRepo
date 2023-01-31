package com.kh.main;

import com.kh.person.Person;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("d");
		
		Person p1 = new Person();
		p1.setName("이현철");
		p1.setAge(26);
		p1.introduce();
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
	}

}

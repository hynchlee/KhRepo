package com.kh.main;

import com.kh.person.Person;

public class Main {
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		p1.setName("장철수");
		p1.setAge(35);
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
	}

}

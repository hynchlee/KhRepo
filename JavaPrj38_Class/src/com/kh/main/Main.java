package com.kh.main;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("메인 호출됨");
		
		Person p = new Person();
		p.setName("이현철");
		p.setAge(26);
		System.out.println(p.getAge());
		
		p.setAge(27);
		System.out.println(p.getAge());
		
		p.setAge(2);
		System.out.println(p.getAge());
		
		
	}

}

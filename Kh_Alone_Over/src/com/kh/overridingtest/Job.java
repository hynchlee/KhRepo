package com.kh.overridingtest;

class Woman{
	public String name;
	public int age;
	
	public void info() {
		
		System.out.println("여자의 이름은 "+name+"이고, 나이는 "+age+"살 입니다.");
	}
}

public class Job extends Woman{
	String job;
	
	public void info() {
		super.info();
		System.out.println("여자의 직업은 "+job+"입니다.");
	}
}
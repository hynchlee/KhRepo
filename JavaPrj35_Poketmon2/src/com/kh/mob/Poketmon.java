package com.kh.mob;

public class Poketmon {

	public String name;
	public int atk;
	
	public void bodyAttack() {
		System.out.println("몸통 박치기");
	}
	
	public void mobSkill() {
		
	}
	
	public String toString() {
		return "name = " + this.name + ", 공격력 = " + atk;
	}
	
}

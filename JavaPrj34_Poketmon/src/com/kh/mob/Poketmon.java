package com.kh.mob;

public abstract class Poketmon {

	public int hp;
	public int atk;
	public int def;

	public void bodyAttack() {
		System.out.println("몸통박치기 ( "+ atk +" )");
	}
	 
	
	public abstract void skill();
		
	
	public void skill(String str) {
		System.out.println(str + "( " + atk*2 + " )");
	}
	
}

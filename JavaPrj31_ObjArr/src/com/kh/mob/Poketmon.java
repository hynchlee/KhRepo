package com.kh.mob;

public class Poketmon {

	private String name;
	private int hp;
	private int atk;

	//기본 생성자
	public Poketmon() {
		
	}
	
	//파라미터가 있는 생성자
	public Poketmon(String name, int hp, int atk) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
	}
	
	public void attack() {
		System.out.println(name + "의 공격!");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public int getAtk() {
		return atk;
	}

	public String toString() {
		return "name = " + name + ", hp = " + hp + ", atk = " + atk;
	}

}

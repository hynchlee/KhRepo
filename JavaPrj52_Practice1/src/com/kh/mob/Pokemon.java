package com.kh.mob;

public class Pokemon {
	
	private String name;
	private String skillName;
	private int hp;
	private int atk;
	
	public void bodyAttack() {
		System.out.println(name + "의 몸통 박치기");
	}
	
	public void skill() {
		System.out.println(name + "의 " + skillName + "!!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	@Override
	public String toString() {
		return "Pokemon [name=" + name + ", skillName=" + skillName + ", hp=" + hp + ", atk=" + atk + "]";
	}

	public Pokemon(String name, String skillName, int hp, int atk) {
		super();
		this.name = name;
		this.skillName = skillName;
		this.hp = hp;
		this.atk = atk;
	}

	public Pokemon() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

package com.game;

import com.main.Main;

public class Person {

	public String name;

	public void battleInfo() {
		System.out.print("사용자의 이름을 입력하세요 : ");
		name = Main.SC.next();
		System.out.println(name + " vs 영미");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

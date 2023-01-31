package com.game;

import com.main.Main;

public class Manager {

	Rsp rsp = new Rsp();

	public void startGame() {

		insertCoin();

		gameInfo();

	}

	public void insertCoin() {
		System.out.println("코인 넣기");
		System.out.println("1.한화 2.달러 3.엔화 4.차이니즈머니 5~. 기타등등...");
		System.out.print("코인을 넣으세요 : ");
		Main.SC.nextInt();

		Person p = new Person();
		p.battleInfo();

	}

	public void gameInfo() {
		System.out.println("!!게임을 시작합니다!!");
		System.out.println("1.가위 2.바위 3.보");
		System.out.println("가위 = 2칸, 바위 = 3칸, 보 = 5칸");
		System.out.println("======================");

		rsp.rspGame();
	}

}

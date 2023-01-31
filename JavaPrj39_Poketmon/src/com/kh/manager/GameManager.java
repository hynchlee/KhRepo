package com.kh.manager;

import java.util.Scanner;

import com.kh.mob.Pokemon;

public class GameManager {
	
	Scanner sc = new Scanner(System.in);

	Pokemon[] arr = new Pokemon[3];
	Pokemon user;
	Pokemon enemy;

	public void startGame() {
		
		// 몬스터 생성
		generatMob();

		// 유저 포켓몬 선택
		selectUserMob();

		// 적 포켓몬 선택
		selectEnemyMob();

		// 배틀
		startBattle();
	}

	private void generatMob() {

		// 포켓몬 객체 생성
		arr[0] = new Pokemon("피카츄", 80, 30, 15); // Pokemon 생성자에 파라미터 값을 맞춰야 한다.
		arr[1] = new Pokemon("마자용", 60, 40, 10); // Pokemon 생성자에 파라미터 값을 맞춰야 한다.
		arr[2] = new Pokemon("꼬마돌", 100, 15, 20); // Pokemon 생성자에 파라미터 값을 맞춰야 한다.

		// 생성된 몬스터 정보 출력
		printMobInfo();

	}

	private void printMobInfo() {

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	private void selectUserMob() {
		System.out.print("포켓몬을 선택하세요 : ");
		int num = sc.nextInt();

		user = arr[num - 1];
		System.out.println(user/*.toString()*/);
	}

	// 상대 포켓몬 선택
	private void selectEnemyMob() {
		int random = (int) (Math.random() * 3 + 0);
		enemy = arr[random];
		System.out.println("상대 포켓몬 : " + enemy);
	}

	private void startBattle() {
		BattleManager bm = new BattleManager();
		bm.battleStart(user, enemy);
	}
	
}
package com.kh.manager;

import com.kh.mob.Pokemon;

public class GameManager {

	private Pokemon[] pArr = new Pokemon[3];

	// 포켓몬 생성
	public void generateMob() {
		pArr[0] = new Pokemon("피카츄", "백만볼트", 100, 30);
		pArr[1] = new Pokemon("피존", "빨래", 800, 8);
		pArr[2] = new Pokemon("다우니", "세탁정리", 200, 15);

		printMobInfo();

	}

	public void printMobInfo() {
		// arr배열에 들어있는 모든 포켓몬 정보 출력
		for (Pokemon p : pArr) {
			System.out.println(p);

		}

	}

}

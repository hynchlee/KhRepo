package com.main;

import java.util.Scanner;

import com.game.Manager;

public class Main {

	public static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("계단 오르기 게임");

		// 매니저 객체 생성
		Manager m = new Manager();
		m.startGame();

	}

}

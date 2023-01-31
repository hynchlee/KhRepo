package com.game;

import com.main.Main;

public class Rsp {

	private int com;
	private int user;
	private int stairs;
	private int Cstairs;
	private int Ustairs;

	Person p = new Person();

	public void rspGame() {

		stairs = (int) (Math.random() * 10) + 10;
		Cstairs = stairs;
		Ustairs = stairs;
		System.out.println("계단의 개수는 " + stairs + "개 입니다.");

		while (true) {

			com = (int) (Math.random() * 3) + 1;
			System.out.print("사용자 : ");
			user = Main.SC.nextInt();

			if (com == 1) {
				if (user == 1) {
					System.out.println("비겼습니다.");
				} else if (user == 2) {
					System.out.println("이겼습니다.");
					System.out.println("User가 3칸 위로 올라갑니다.");
					Ustairs -= 3;
					System.out.println(p.name + " 남은 계단 수 : " + Ustairs);
					if (Ustairs <= 0) {
						System.out.println("User 정상 도착");
						break;
					}
				} else if (user == 3) {
					System.out.println("졌습니다.");
					System.out.println("Com이가 2칸 위로 올라갑니다.");
					Cstairs -= 2;
					System.out.println("Com 남은 계단 수 : " + Cstairs);
					if (Cstairs <= 0) {
						System.out.println("Com 정상 도착");
						break;
					}
				}

			} else if (com == 2) {
				if (user == 1) {
					System.out.println("졌습니다.");
					System.out.println("Com이가 3칸 위로 올라갑니다.");
					Cstairs -= 3;
					System.out.println("Com 남은 계단 수 : " + Cstairs);
					if (Cstairs <= 0) {
						System.out.println("Com 정상 도착");
						break;
					}
				} else if (user == 2) {
					System.out.println("비겼습니다.");
				} else if (user == 3) {
					System.out.println("이겼습니다.");
					System.out.println("User가 5칸 위로 올라갑니다.");
					Ustairs -= 5;
					System.out.println("User의 남은 계단 수 : " + Ustairs);
					if (Ustairs <= 0) {
						System.out.println("User 정상 도착");
						break;
					}
				}

			} else if (com == 3) {
				if (user == 1) {
					System.out.println("이겼습니다.");
					System.out.println("User가 2칸 위로 올라갑니다.");
					Ustairs -= 2;
					System.out.println("User의 남은 계단 수 : " + Ustairs);
					if (Ustairs <= 0) {
						System.out.println("User 정상 도착");
						break;
					}
				} else if (user == 2) {
					System.out.println("졌습니다.");
					System.out.println("Com이가 5칸 위로 올라갑니다.");
					if (Cstairs <= 0) {
						System.out.println("Com 정상 도착");
						break;
					}
					Cstairs -= 5;
					System.out.println("Com 남은 계단 수 : " + Cstairs);
				} else if (user == 3) {
					System.out.println("비겼습니다.");
				}

			}

		}

	}

}
